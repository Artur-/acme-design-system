import { ButtonElement } from "@vaadin/vaadin-button/src/vaadin-button.js";

export class MyButton extends ButtonElement {
  static get is() {
    return "my-button";
  }
  ready() {
    super.ready();
    this.$.button.addEventListener("click", (e) => {
      this.flash();
    });
  }

  flash() {
    const bg = getComputedStyle(this).background;
    this.style.background = "white";
    setTimeout(() => (this.style.background = bg), 100);
  }
}

customElements.define(MyButton.is, MyButton);
