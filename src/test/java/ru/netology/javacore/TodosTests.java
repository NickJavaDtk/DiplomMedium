package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TodosTests {

    // ваши тесты для класса Todos
    @Test
    void addTodosTest() {
        Todos todos = new Todos( );
        String s = "Сходить поесть";
        String s1 = "Посмотреть телевизор";
        String s2 = "Вылезти из-за компьютера";
        String s3 = "Дать мозгам отдохнуть";

        todos.addTask(s);
        todos.addTask(s1);
        todos.addTask(s2);
        todos.addTask(s3);


        String expected = "Вылезти из-за компьютера Дать мозгам отдохнуть Посмотреть телевизор Сходить поесть";
        String result = todos.getAllTasks( );


        Assertions.assertEquals(expected, result);
    }

    @Test
    void removeTodosTest() {
        Todos todos = new Todos( );
        String s = "Сходить поесть";
        String s1 = "Посмотреть телевизор";
        String s2 = "Вылезти из-за компьютера";
        String s3 = "Дать мозгам отдохнуть";

        todos.addTask(s);
        todos.addTask(s1);
        todos.addTask(s2);
        todos.addTask(s3);
        todos.removeTask(s3);


        String expected = "Вылезти из-за компьютера Посмотреть телевизор Сходить поесть";
        String result = todos.getAllTasks( );


        Assertions.assertEquals(expected, result);
    }

    @Test
    void removeTodosTestException() {
        Todos todos = new Todos( );
        String s = "Сходить поесть";
        String s1 = "Посмотреть телевизор";
        String s2 = "Вылезти из-за компьютера";
        String s3 = "Дать мозгам отдохнуть";
        String s4 = "Потестировать JUnit";

        todos.addTask(s);
        todos.addTask(s1);
        todos.addTask(s2);
        todos.addTask(s3);

        Assertions.assertThrows(IllegalArgumentException.class, () -> todos.removeTask(s4));
    }

}
