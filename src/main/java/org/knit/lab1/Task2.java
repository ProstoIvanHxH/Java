package org.knit.lab1;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class Task2 {
    public void execute() {

        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        String[] test = urlValue.split("/");
//        for (int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
        String webpa = test[5].substring(0,test[5].indexOf("?"));

        SimpleUrl url = new SimpleUrl(test[0].substring(0, test[0].length() - 1), test[2], test[2].substring(test[2].indexOf(".") + 1, test[2].length()), test[3], webpa, webpa.substring(webpa.indexOf(".")+1,webpa.length()));
        String ulo = url.toString();
        System.out.println(ulo);
        /* tips
         * urlValue.split(":");
         */

        //todo create class SimpleUrl()
        // SimpleUrl url= new SimpleUrl();
        // url.setAddress(address);
        // url.setProtocol(protocol)
        // System.out.println(url);
    }
}
