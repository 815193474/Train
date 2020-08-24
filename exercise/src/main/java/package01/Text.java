package package01;

import java.util.Date;

/**
 * @Author wolf  VX:a815193474
 * @Date 2019-11-18 15:58
 */
public class Text {
    private String name;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Text{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
