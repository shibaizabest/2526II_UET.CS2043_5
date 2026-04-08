public class MacFactory implements UIFactory{

    @Override
    public void createButton() {
        MacButton macButton = new MacButton();
        macButton.render();
    }

    @Override
    public void createCheckbox() {
        MacCheckbox macCheckbox = new MacCheckbox();
        macCheckbox.render();
    }
}
