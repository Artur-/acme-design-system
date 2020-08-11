package org.vaadin.artur.mydesignsystem.component;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("my-button")
@NpmPackage(value = "lit-element", version = "2.3.0")
@JsModule("./acme-component/my-button.js")
public class MyButton extends Button {
    public MyButton() {
    }

    public MyButton(String text) {
        setText(text);
    }

    public MyButton(Component icon) {
        setIcon(icon);
    }

    public MyButton(String text, Component icon) {
        setIcon(icon);
        setText(text);
    }

    public MyButton(String text, ComponentEventListener<ClickEvent<Button>> clickListener) {
        setText(text);
        addClickListener(clickListener);
    }

    public MyButton(Component icon, ComponentEventListener<ClickEvent<Button>> clickListener) {
        setIcon(icon);
        addClickListener(clickListener);
    }

    public MyButton(String text, Component icon, ComponentEventListener<ClickEvent<Button>> clickListener) {
        setIcon(icon);
        setText(text);
        addClickListener(clickListener);
    }

}