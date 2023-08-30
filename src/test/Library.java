package test;

import java.util.Objects;

public class Library {
    private String[] list;
    private int count;

    public Library(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("도서관의 크기는 1보다 커야합니다.");
        }
        list = new String[size];
        count = 0;

        for (int i = 0; i < size; i++) {
            list[i] = "";
        }
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean checkdup(String[] tmplist, int index, String name) {
        for (int i = 0; i <= index; i++) {
            if (tmplist[index] == name) {
                return false;
            }
        }
        return true;
    }

    public void add(String name) {
        String[] tmp = getList();
        int num = getCount();
        if (count == list.length) {
            throw new IllegalArgumentException("list is full");
        }

        if (checkdup(tmp, num, name) == true) {
            tmp[num] = name;
            setList(tmp);
            setCount(num + 1);
            System.out.println(name + "추가됨");
        } else {
            System.out.println("you already add this book!");
        }
    }

    public void delate(String name) {
        String[] tmp = getList();
        int num = getCount();

        if (checkdup(tmp, num, name) == false) {
            for (int i = 0; i <= num; i++) {
                if (tmp[i] == name) {
                    tmp[i] = "";
                }
            }
            setList(tmp);
            setCount(num - 1);
        } else if (checkdup(tmp, num, name) == true) {
            throw new IllegalArgumentException("book is not exist");
        }
    }

    public void find(String name) {
        String[] tmp = getList();
        int num = getCount();

        if (checkdup(tmp, num, name) == false) {
            for (int i = 0; i <= num; i++) {
                if (tmp[i] == name) {
                    System.out.println("당신의 책은" + i + "번째에 위치해있습니다.");
                }
            }
        } else if (checkdup(tmp, num, name) == true) {
            throw new IllegalArgumentException("book is not exist");
        }
    }

    public void finAll() {
        String[] tmp = getList();
        int num = getCount();

        for (int i = 0; i < tmp.length; i++) {
            if (!Objects.equals(tmp[i], "")) {
                System.out.println(i + "번째 책 : " + tmp[i]);
            }
        }
    }
}
