package Module3.Directory;

/**
 * class TextFile
 *
 * Задание к Модулю 2.
 * Создать UML диаграмму с классами Текстовый файл, Аудио файл, Файл изображения, используя класс Файл.
 * Создать класс Директория, содержащий файлы разных форматов.
 *
 * Задание к Модулю 3.
 * Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/directory.jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 06.03.2016.
 */

class TextFile extends File {

    private String fileType = "Text File";

    @Override
    public String getFileType() {
        return this.fileType;
    }
}
