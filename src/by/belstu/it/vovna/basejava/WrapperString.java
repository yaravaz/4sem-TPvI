package by.belstu.it.vovna.basejava;

import java.util.Objects;

/**
 * @author Ярослава
 * @version 1.1
 */
public class WrapperString {
    /**
     * переопределение метода toString
     * @return строка со занчением приватного поля
     */
    @Override
    public String toString() {
        return "WrapperString{" +
                "privStr='" + privStr + '\'' +
                '}';
    }

    /**
     * переопределение метода equals
     * @param o сравниваемый объект
     * @return булевое значение равенства ссылок на объект
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(privStr, that.privStr);
    }

    /**
     * переопределение метода hashCode()
     * @return хеш строки
     */

    @Override
    public int hashCode() {
        return Objects.hash(privStr);
    }

    /**
     * геттер для приватного поля String privStr
     * @return строку privStr
     */

    public String getStr() {
        return privStr;
    }

    /**
     * сеттер для приватного поля String privStr
     * @param str значение строки
     */

    public void setStr(String str) {
        this.privStr = str;
    }

    /**
     * приватное поле
     */
    private String privStr;

    /**
     * конструктор класса
     * @param str строка для присваивания значению поля privStr
     */
    public WrapperString(String str) {
        this.privStr = str;
    }

    /**
     * конструктор без параметров
     */
    public WrapperString(){
    }

    /**
     * метод для замены символа на двурой
     * @param oldchar первый символ, который меняет
     * @param newchar второй символ, на который меняет
     */
    public void replace(char oldchar, char newchar) {
        char[] chars = this.privStr.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldchar) {
                chars[i] = newchar;
            }
        }

        this.privStr = new String(chars);
    }

}
