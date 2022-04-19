package BO;

import PO.LoginPO;

public class LoginBO
{
    public boolean login(String login, String pass)
    {
        return new LoginPO()
                .goToLoginPage()
                .inputLogin(login)
                .inputPass(pass)
                .submit()
                .isOpen();


    }
}
