package 作业5;

import java.io.Serializable;

public class Message implements Serializable {

    private String input;
    private String output;
    private String message;
    private String data;

    public Message() {
    }

    public Message(String input, String output, String message, String data) {
        this.input = input;
        this.output = output;
        this.message = message;
        this.data = data;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "input='" + input + '\'' +
                ", output='" + output + '\'' +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
