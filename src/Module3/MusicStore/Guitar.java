package Module3.MusicStore;

/**
 * class Guitar
 *
 * Создать UML диаграмму с классами Гитара, Фортепиано, Труба, используя класс Музыкальный инструмент.
 * Открыть Музыкальный магазин.
 *
 *Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/musical_instrumets(correct).jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 06.03.2016.
 */

class Guitar extends MusicalInstrument {

    private String instrumentName = "Guitar";

    public String getInstrumentName() {
        return instrumentName;
    }
}
