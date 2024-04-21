package FactoryMethods.RefractingGuruExample.Factory;
import FactoryMethods.RefractingGuruExample.buttons.*;
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}