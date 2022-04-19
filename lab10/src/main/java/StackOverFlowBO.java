public class StackOverFlowBO
{

    public boolean manipulate()
    {
        StackOverFlowPO stackOverFlowPO = new StackOverFlowPO();
        stackOverFlowPO.goToStackOverFlow().sendTextToInput().clickLogin();

        return stackOverFlowPO.isOpen();

    }

    public boolean checkVisible()
    {
        StackOverFlowPO stackOverFlowPO = new StackOverFlowPO();
        stackOverFlowPO.goToStackOverFlow();
        return stackOverFlowPO.isMenuVisible() && stackOverFlowPO.isSignUpVisible() && stackOverFlowPO.isInputVisible()
                && stackOverFlowPO.isLoginVisible() && stackOverFlowPO.isLogoVisible();
    }

}
