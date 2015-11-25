package data;

/**
 * Created by Alycha on 11/24/2015.
 */

public enum Locators {
    COMPOSE_EMAIL("T-I-KE"),
    SEND_EMAIL("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"),
    EMAIL("//span[@email='alonya.potter@gmail.com']"),
    REFRESH_INBOX("//div[@class='asf T-I-J3 J-J5-Ji']"),
    DELETE_EMAIL("//div[@class='ar9 T-I-J3 J-J5-Ji']"),
    RECEIVER_INPUT("vO"),
    SUBJECT_INPUT("aoT"),
    BODY_INPUT("//div[@aria-label='Message Body']"),
    GOOGLE_SIGNIN("gb_70"),
    CLOSE_POPUP("//a[@title='No thanks']"),
    GOOGLE_APPS("gbwa"),
    GMAIL_APP("gb23"),
    LOGIN_NEXT("next"),
    LOGIN_EMAIL("Email"),
    PWD_PWD_INPUT("Passwd"),
    PWD_NEXT("signIn"),
    PWD_REMEMBER_ME("PersistentCookie"),
    PASSWORD("Aly230645"),
    LOGIN("alonya.potter");




    private final String value;
    Locators(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
