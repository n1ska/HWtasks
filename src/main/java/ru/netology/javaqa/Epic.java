package ru.netology.javaqa;

public class Epic extends Task{
    private String[] subtasks;
    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] GetSubtasks(){
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (int i = 0; i < subtasks.length; i++){
            if (query.contains(subtasks[i])){
                return true;
            }
        }

        return super.matches(query);
    }
}
