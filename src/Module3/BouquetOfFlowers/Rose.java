package Module3.BouquetOfFlowers;

/**
 * class Rose
 *
 * Создать UML диаграмму с классами Роза, Ромашка, Астра, используя класс Цветок.
 * Собрать Букет цветов. Дополнить систему классами Тюльпан и Розовый куст.
 *
 * Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/flowers.jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 06.03.2016.
 */

class Rose extends Flower {

    private String flowersName = "Rose";

    public String getFlowersName() {
        return this.flowersName;
    }
}