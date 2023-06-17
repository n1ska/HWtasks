package ru.netology.javaqa;
public class Meeting extends Task{
    private String topic;
    private String project;
    private String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);

        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        if (query.contains(topic)){
            return true;
        }
        if (query.contains(project)){
            return true;
        }

        return super.matches(query);
    }
}
