// These functions should all be outside a design system

export const injectGlobalCss = (css: string) => {
  const sheet = new CSSStyleSheet();
  //@ts-ignore
  sheet.replaceSync(css);
  //@ts-ignore
  document.adoptedStyleSheets = [sheet];
};
