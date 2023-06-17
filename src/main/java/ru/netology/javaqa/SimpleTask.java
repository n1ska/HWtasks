package ru.netology.javaqa;

public class SimpleTask extends Task{

    private String title;
    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;
    }

    public String GetTitle(){
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (query.contains(title)){
            return true;
        }
        return super.matches(query);
    }
}
