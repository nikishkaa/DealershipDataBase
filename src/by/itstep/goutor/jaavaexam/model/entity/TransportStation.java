package by.itstep.goutor.jaavaexam.model.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransportStation implements Iterable {
    private List<Transport> list;

    public TransportStation() {
        list = new ArrayList<>();
    }

    public TransportStation(List<Transport> list) {
        this.list = list;
    }

    public List<Transport> getList() {
        return list;
    }

    public void setList(List<Transport> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of car:");
        for (Transport transport : list) {
            builder.append("\n").append(transport);
        }

        return builder.toString();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
