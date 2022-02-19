package com.company;

public class Panel extends Icon {
    @Override
    public void introduse(){System.out.println("Привет! Давай проверим панель с категориями товаров в центральной " +
            "части страницы." +
            "Сними коментарии следующей строчки кода.");}
    public void cursorPanel(String name){System.out.println("Наведи курсор на название"+" " +
            "категории товаров"+" "+name+" "+", название изменило свой цвет, появился выпадающий каталог категории"+" "+name+".");
        System.out.println("Сними коментрарии следующей строчки кода");}
    @Override
    public void click(String name) {System.out.println("Кликни на название категории"+" "+ name+".");
        System.out.println("Сними коментрарии следующей строчки кода");}
    @Override
    public void ps(){
        System.out.println("Хочешь проверить другие категории! Поменяй значение переменной click.name" +" "+
                "!");
        System.out.println("Если это не подходит, я создам кучу новых объектов для других категорий:).");}
}


