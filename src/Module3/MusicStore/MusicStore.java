package Module3.MusicStore;

import java.util.List;

/**
 * class MusicStore
 *
 * Создать UML диаграмму с классами Гитара, Фортепиано, Труба, используя класс Музыкальный инструмент.
 * Открыть Музыкальный магазин.
 *
 *Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/musical_instrumets(correct).jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 03.03.2016.
 */

class MusicStore {

    static void someInstrumetn() {

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();

        System.out.println(guitar.getInstrumentName());
        System.out.println(piano.getInstrumentName());
        System.out.println(trumpet.getInstrumentName());
    }

}
