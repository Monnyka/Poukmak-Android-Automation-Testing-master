package Testcase;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Login extends BaseClass{

//    @Test
//    public void passTest() throws IOException, InterruptedException {
//        test = extent.startTest("TC001");
//        takeScreenShot("TC001");
//        Thread.sleep(5000);
//        takeScreenShot("TC002");
//        openNotification();
//        Thread.sleep(5000);
//        closeNotification();
//        Thread.sleep(5000);
//
//        test.log(LogStatus.PASS, "Pass");
//        Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
//    }
//
//    @Test
//    public void passTest1() throws IOException, InterruptedException {
//        test = extent.startTest("TC002");
//        takeScreenShot("TC001");
//        Thread.sleep(5000);
//        takeScreenShot("TC002");
//        openNotification();
//        Thread.sleep(5000);
//        closeNotification();
//        Thread.sleep(5000);
//
//        test.log(LogStatus.PASS, "Pass");
//        Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
//    }

    @Test
    public void testChat() throws InterruptedException {
        MobileElement pButton = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        pButton.click();
        MobileElement langButton = driver.findElementById("com.cellcard.chatapp:id/btn_kh");
        langButton.click();
        MobileElement pContactButton = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        pContactButton.click();
        MobileElement txtPhoneNumber = driver.findElementById("com.cellcard.chatapp:id/ed_mobile_number");
        txtPhoneNumber.sendKeys("69910164");
        MobileElement btnContinue = driver.findElementById("com.cellcard.chatapp:id/btn_enter_phone_continue");
        btnContinue.click();

        MobileElement txtCCOne = driver.findElementById("com.cellcard.chatapp:id/ed_code_one");
        txtCCOne.sendKeys("1");
        MobileElement txtCCTwo = driver.findElementById("com.cellcard.chatapp:id/ed_code_two");
        txtCCTwo.sendKeys("1");
        MobileElement txtCCThree = driver.findElementById("com.cellcard.chatapp:id/ed_code_three");
        txtCCThree.sendKeys("1");
        MobileElement txtCCFour = driver.findElementById("com.cellcard.chatapp:id/ed_code_four");
        txtCCFour.sendKeys("1");
        MobileElement txtCCFive = driver.findElementById("com.cellcard.chatapp:id/ed_code_five");
        txtCCFive.sendKeys("1");
        MobileElement txtCCSix = driver.findElementById("com.cellcard.chatapp:id/ed_code_six");
        txtCCSix.sendKeys("1");

        MobileElement btnLetStart = driver.findElementById("com.cellcard.chatapp:id/btn_let_start");
        btnLetStart.click();

//        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//        MobileElement btnDisc = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"APP_LABEL_DISCOVER\"]");
//        btnDisc.click();
//        MobileElement btnChats = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"APP_LABEL_CHATS\"]");
//        btnChats.click();

        //Search Chat Group
        MobileElement edt_search = driver.findElementById("com.cellcard.chatapp:id/edt_search");
        edt_search.sendKeys("Pouk Mak Automation Testing");

        //click on group chat
        MobileElement groupChatList = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        groupChatList.click();

        //Sending Chat to Group
        for(int i=0;i<=2000;i++){

            Quote quoteList = new Quote();
            Random r=new Random();
            int randomNumber=r.nextInt(quoteList.quote.length);
            System.out.println(quoteList.quote[randomNumber]);

            long millis=System.currentTimeMillis();
            java.util.Date date = new java.util.Date(millis);

            //Sending Chat
            MobileElement edt_chat = driver.findElementById("com.cellcard.chatapp:id/ed_input_message");
            edt_chat.sendKeys( quoteList.quote[randomNumber] + "\n" +
                    "\nSequence: " + i +
                    "\nSender: 069910164" +
                    "\nDate: " + date +
                    "\n");
            MobileElement btnSend = driver.findElementById("com.cellcard.chatapp:id/iv_send");
            btnSend.click();

            //Choose Sticker Set
            MobileElement btnSticker = driver.findElementById("com.cellcard.chatapp:id/iv_emoji");
            btnSticker.click();
            String[] randSelectSticker={"3","4"};
            Random randStickerSet = new Random();
            int stickerSetNum = randStickerSet.nextInt(randSelectSticker.length);
            MobileElement selectSticker = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout["+randSelectSticker[stickerSetNum]+"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
            selectSticker.click();

            //Send Sticker
            String[] randomNum={"1","2","3","4","5","6","7"};
            Random random=new Random();
            int stickerNum=random.nextInt(randomNum.length);
            MobileElement sendSticker = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+randomNum[stickerNum]+"]/android.widget.ImageView");
            sendSticker.click();

            MobileElement btnAttachment = driver.findElementById("com.cellcard.chatapp:id/btn_attachment");
            btnAttachment.click();
            MobileElement btnGallery = driver.findElementById("com.cellcard.chatapp:id/layout_select_gallery");
            btnGallery.click();

            //Select Image
            MobileElement imageSelect = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");
            imageSelect.click();

            //Select Forward Button
            MobileElement btnDone = driver.findElementById("com.cellcard.chatapp:id/button_done");
            btnDone.click();
        }
    }
}
