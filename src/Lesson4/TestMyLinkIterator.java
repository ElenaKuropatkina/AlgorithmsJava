package Lesson4;

public class TestMyLinkIterator {
    public static void main(String[] args) {

        MyLinkedList<String> mll = new MyLinkedList();

        mll.insertFirst("bbb");
        mll.insertLast("ddd");
        mll.insertFirst("aaa");
        mll.insert("ccc", 2);
        System.out.println(mll.toString());

        MyLinkIterator itr = new MyLinkIterator(mll);

        System.out.println("Элемент, на который указывает итератор: " + itr.getCurrent());
        System.out.println("Перейдем к следующему элементу");
        itr.nextLink();
        System.out.println("Элемент, на который указывает итератор: " + itr.getCurrent());
        System.out.println("Удалим текущий элемент");
        itr.deleteCurrent();
        System.out.println(mll.toString());
        System.out.println("Проверим положение итератора: дошел он до конца списка или нет");
        System.out.println(itr.atEnd());
        System.out.println("Вставим значение после элемента, на который указывает итератор");
        itr.insertAfter("fff");
        System.out.println(mll.toString());
        System.out.println("Вставим значение до элемента, на который указывает итератор");
        itr.insertBefore("zzz");
        System.out.println(mll.toString());
    }
}
