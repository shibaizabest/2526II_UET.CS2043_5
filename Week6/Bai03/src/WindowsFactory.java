public class WindowsFactory implements UIFactory{

    @Override
    public void createButton() {
        WindowsButton windowsButton = new WindowsButton();
        windowsButton.render();
    }

    @Override
    public void createCheckbox() {
        WindowsCheckbox windowsCheckbox = new WindowsCheckbox();
        windowsCheckbox.render();
    }
}
