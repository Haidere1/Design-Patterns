package FactoryMethods.RefractingGuruExample.Factory;

import FactoryMethods.RefractingGuruExample.buttons.Button;
import FactoryMethods.RefractingGuruExample.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}