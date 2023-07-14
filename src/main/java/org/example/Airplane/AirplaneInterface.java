package org.example.Airplane;

public interface AirplaneInterface {

    void create(Airplane airplane);
    void edit(Airplane airplane);
    void delete(String id);

    Airplane search(String id);

}
