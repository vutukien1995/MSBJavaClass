/* Đặc tả & Yêu cầu URD
 * Yêu cầu URD:
Transaction Servie API
Input:
{
	"creditAccount" : "",
	"debitAccount" : "",
	"amount" : "",
	"remark" : ""
}

Output:
{
	"message" : "",
	"errCode" : "",
	"timestamp" : ""
}


1. Đặc tả:
creditAccount : tk cộng
debitAccount : tk trừ
amount : số tiền chuyển
...

- Tiền được chuyển khi creditAccount và debitAccount tồn tại
debitAccount có số dư >= amount
	+ Chuyển tiền thành công
		=> message = "Success !!"
		=> errCode = ""

	+ creditAccount và debitAccount không tồn tại
		=> message = "[...account] số tài khoản không tồn tại"
		=> errCode = "TRANSERR01"
		
	+ debitAccount số dư < amount
		=> message = "Tài khải debitAccount không đủ số dư"
		=> errCode = "TRANSERR02"

2. Validation
- creditAccount, debitAccount và amount là chuỗi toàn số
	+ không chỉ chứa số 
		=> message = "Trường [...] không đúng định dạng"
		=> errCode = "MSGERR01"

- remark là text mà length <= 200
	+ length > 200
		=> message = "Remark dài quá 200 kí tự"
		=> errCode = "MSGERR02"
 */
package com.msb.lesson11.TanNT9;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitTest {
	@Test
	// - Tiền được chuyển khi creditAccount và debitAccount tồn tại debitAccount có
	// số dư >= amount (mới có case >, chưa có case =)
	public void run1() {
		System.out.println("~ 1. Start Test Transfer ~");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939399", "0100110199922", // stk 013993939399 và
																						// 0100110199922 tồn tại
				"1000000", "Chuyen tien !!!");
		TransactionOutput dummyData = new TransactionOutput("Success !!", "");
		api.dummyDataOutput(dummyData);

		Assert.assertEquals(api.trans(input).getErrCode(), "");
		System.out.println("~ End Test ~\n");
	}

	@Test
	public void run2WithDelayTime() {
		System.out.println("~ 2. Start Test with delay time ~");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939399", "0100110199922", "1000000", "Chuyen tien !!!");
		TransactionOutput dummyData = new TransactionOutput("Success !!", "");
		api.dummyDataOutput(dummyData);
		api.dummyDelayTime(2000);

		Assert.assertEquals(api.trans(input).getErrCode(), "");
		System.out.println("~ End Test ~\n");
	}

	@Test
	// -creditAccount và debitAccount không tồn tại
	public void run3AccountsNotExist() {
		System.out.println("~ 3. Start Test Existence of Account ~");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939398", "0100110199923", // giả sử STK 013993939398 và
																						// 0100110199923 ko tổn tại
				"1000000", "Chuyển tiền với 2 stk không tồn tại!!!");
		TransactionOutput dummyData = new TransactionOutput(
				input.getCreditAccount() + " và " + input.getDebitAccount() + ": số tài khoản không tồn tại",
				"TRANSERR01");
		api.dummyDataOutput(dummyData);

		Assert.assertEquals(api.trans(input).getErrCode(), "TRANSERR01");
		System.out.println("~ End Test Existence of Account ~\n");

	}

	@Test
	// -creditAccount không tồn tại
	public void run4CreditAccountNotExist() {
		System.out.println("~ 4. Start Test Existence of CreditAccount ~");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939398", "0100110199922", // giả sử STK 013993939398 ko tổn
																						// tại
				"1000000", "Chuyển tiền với CreditAccount không tồn tại!!!");
		TransactionOutput dummyData = new TransactionOutput(input.getCreditAccount() + ": số tài khoản không tồn tại",
				"TRANSERR01");
		api.dummyDataOutput(dummyData);

		Assert.assertEquals(api.trans(input).getErrCode(), "TRANSERR01");
		System.out.println("~ End Test Existence of CreditAccount ~\n");

	}

	@Test
	// -debitAccount không tồn tại
	public void run5DebitAccountNotExist() {
		System.out.println("~ 5. Start Test Existence of DebitAccount ~");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939399", "0100110199923", // giả sử STK 0100110199923 ko
																						// tổn tại
				"1000000", "Chuyển tiền với DebitAccount không tồn tại!!!");
		TransactionOutput dummyData = new TransactionOutput(input.getDebitAccount() + ": số tài khoản không tồn tại",
				"TRANSERR01");
		api.dummyDataOutput(dummyData);

		Assert.assertEquals(api.trans(input).getErrCode(), "TRANSERR01");
		System.out.println("~ End Test Existence of DebitAccount ~\n");

	}

	@Test
	// - debitAccount số dư < amount
	public void run6BalanceDebitAccount() {
		System.out.println("~ 6. Start Test Balance of DebitAccount ");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939399", "0100110199922", // giả sử STK 0100110199922 có 1
																						// 000 000 000 VND
				"1000000001", "Số tiền chuyển lớn hơn số dư thẻ Debit!!!");
		TransactionOutput dummyData = new TransactionOutput("Tài khoản debitAccount không đủ số dư", "TRANSERR02");
		api.dummyDataOutput(dummyData);

		Assert.assertEquals(api.trans(input).getErrCode(), "TRANSERR02");
		System.out.println("~ End Test Balance of DebitAccount ~\n");

	}

	@Test
	// Validate Accounts
	public void run7ValidateAccounts() {
		System.out.println("~ 7. Start Test Validate CreditAccount and DebitAccount ");
		TransactionServiceAPI api = new TransactionServiceAPI();

		// Validate CreditAccount and DebitAccount
		TransactionInput input = new TransactionInput("01399393939a", "010b110199922", // CreditAccount và DebitAccount chứa ký tự chữ
				"1000000", " Check validate 2 Accounts");
		TransactionOutput dummyData = new TransactionOutput(
				input.getCreditAccount() + "và " + input.getDebitAccount() + " không đúng định dạng", "MSGERR01");
		api.dummyDataOutput(dummyData);
		Assert.assertEquals(api.trans(input).getErrCode(), "MSGERR01");
		System.out.println("\n");

		// Validate CreditAccount
		TransactionInput input2 = new TransactionInput("01399393939a", "0100110199922", // CreditAccount chứa ký tự chữ
				"1000000", " Check validate CreditAccount Including AlphaNumeric Characters");
		TransactionOutput dummyData2 = new TransactionOutput(input.getCreditAccount() + " không đúng định dạng",
				"MSGERR01");
		api.dummyDataOutput(dummyData2);
		Assert.assertEquals(api.trans(input2).getErrCode(), "MSGERR01");
		System.out.println("\n");

		TransactionInput input3 = new TransactionInput("0!@&993939399", "0100110199922", // CreditAccount chứa ký tự đặc
																							// biệt
				"1000000", " Check validate CreditAccount Including Special Characters");
		TransactionOutput dummyData3 = new TransactionOutput(input.getCreditAccount() + " không đúng định dạng",
				"MSGERR01");
		api.dummyDataOutput(dummyData3);
		Assert.assertEquals(api.trans(input3).getErrCode(), "MSGERR01");
		System.out.println("\n");

		// Validate DebitAccount
		TransactionInput input4 = new TransactionInput("013993939399", "0100a110199922", // DebitAccount chứa ký tự chữ
				"1000000", " Check validate DebitAccount Including AlphaNumeric Characters");
		TransactionOutput dummyData4 = new TransactionOutput(input.getDebitAccount() + " không đúng định dạng",
				"MSGERR01");
		api.dummyDataOutput(dummyData4);
		Assert.assertEquals(api.trans(input4).getErrCode(), "MSGERR01");
		System.out.println("\n");

		TransactionInput input5 = new TransactionInput("013993939399", "0100!@#&110199", // DebitAccount chứa ký tự đặc biệt
				"1000000", " Check validate DebitAccount Including Special Characters");
		TransactionOutput dummyData5 = new TransactionOutput(input.getDebitAccount() + " không đúng định dạng",
				"MSGERR01");
		api.dummyDataOutput(dummyData5);
		Assert.assertEquals(api.trans(input5).getErrCode(), "MSGERR01");

		System.out.println(" ~ End Test Validate CreditAccount and DebitAccount \n");
	}
	
	@Test
	// - Validate Maxlength of Remark = 200
	public void run8ValidateMaxlengthRemark() {
		System.out.println("~ 8. Start Test Maxlength of Remark ");
		TransactionServiceAPI api = new TransactionServiceAPI();

		TransactionInput input = new TransactionInput("013993939399", "0100110199922", 
				"100000", "Field Remark chứa 201 ký tự!!! Field Remark chứa 201 ký tự!!! Field Remark chứa 201 ký tự!!! "
						+ "Field Remark chứa 201 ký tự!!! Field Remark chứa 201 ký tự!!! Field Remark chứa 201 ký tự!!! Field Remark ch");
		TransactionOutput dummyData = new TransactionOutput("Remark dài quá 200 kí tự", "MSGERR02");
		api.dummyDataOutput(dummyData);

		Assert.assertEquals(api.trans(input).getErrCode(), "MSGERR02");
		Assert.assertEquals(api.trans(input).getMessage(), "Remark dài quá 200 kí tự");
		System.out.println("~ End Test Maxlength of Remark ~\n");
	}

}
