package com.company;

public class Icon extends Category implements Element {
    public Icon(String iconDescription) {
        super(iconDescription);
    }

    public Icon(String iconDescription, String name) {
        super(iconDescription, name);
    }

    public Icon() {}

    public void iconDescript (String iconDescription, String name){
        System.out.println("Это иконка"+" "+ iconDescription+" "+"категория"+" "+name+"."+" "+" Хочешь узнать как она работает! Cтирай коменты следующей строки." );
    }
    public void introduse(){System.out.println("Привет!Давай проверим иконки категорий товаров." +
            "Сними коментарии следующей строчки кода.");}
    public void ps(){
        System.out.println("Хочешь проверить другие иконки поменяй значение переменных click.name" +" "+
            " и click.iconDescription.");
        System.out.println("Если это не подходит, я создам кучу новых объектов для других иконок:).");
        System.out.println("Сними коментрарии следующей строчки кода");}
    public void cursor(){System.out.println("Наведи курсор на иконку, иконка изменила свою яркость.");
        System.out.println("Сними коментрарии следующей строчки кода");}
    public void coment(){System.out.println("Сними коментрарии следующей строчки кода");}
    @Override
    public  void open (String name) {System.out.println("Поздравляю! Вы перешли на страницу"+" "+ name+".");
        System.out.println("Сними коментрарии следующей строчки кода");}


    @Override
    public String getType() {
        return null;
    }

    @Override
    public void click(String icondescription) {System.out.println("Кликни на иконку"+" "+ icondescription);
        System.out.println("Сними коментрарии следующей строчки кода");}
}
