package org.example;

import components.Table;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SortableDataTablesTest extends BaseTest {
    @Test
    public void test1() {
        Table table = homePage.clickOnSortableDataTables().getTable1();
        Table.Row row = table.getUniqueRow("fbach@yahoo.com", "Email");
        row.clickEdit();
        row.clickDelete();
        assertEquals(row.editButtonText(), "edit", "No text like this");
        assertEquals(row.deleteButtonText(), "delete", "No text like this");
    }

    @Test
    public void test2() {
        Table table = homePage.clickOnSortableDataTables().getTable2();
        Table.Row row = table.getUniqueRow("jdoe@hotmail.com", "Email");
        String text1 = row.getCellText("Last Name");
        String text2 = row.getCellText("First Name");
        assertEquals(text2, "Jason", "No text like this");
        assertEquals(text1, "Doe", "No text like this");
    }

    @Test
    public void test3() {
        Table table = homePage.clickOnSortableDataTables().getTable2();
        Table.Row row = table.getUniqueRow("jsmith@gmail.com", "Email");
        int size = table.getColumnsSize();
        assertEquals(size, 6, "No. of columns should be six");
    }

    @Test
    public void test4() {
        Table table = homePage.clickOnSortableDataTables().getTable2();
        table.clickOnHeader("Last Name", 3);
        Table.Row row = table.getUniqueRow("tconway@earthlink.net", "Email");
        String text = row.getCellText("Last Name");
        assertEquals(text, "Conway", "No text like this");
    }


}