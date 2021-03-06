package biz.africanbib.Models;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MultiSelectDropdownBuilder {
    private String title;
    private String[] items;
    private int[] itemUid;
    private List<Integer> selectedIndices = new ArrayList<>();
    private String columnName;
    private String tableName;
    private int rowno;
    private String xmlTag;

    public MultiSelectDropdownBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MultiSelectDropdownBuilder setItems(String[] items) {
        this.items = items;
        return this;
    }

    public MultiSelectDropdownBuilder setItemUid(int[] itemUid) {
        this.itemUid = itemUid;
        return this;
    }

    public MultiSelectDropdownBuilder setSelectedIndices(List<Integer> selectedIndices) {
        this.selectedIndices = selectedIndices;
        return this;
    }

    public MultiSelectDropdownBuilder setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public MultiSelectDropdownBuilder setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public MultiSelectDropdownBuilder setRowno(int rowno) {
        this.rowno = rowno;
        return this;
    }

    public MultiSelectDropdownBuilder setXmlTag(String xmlTag) {
        this.xmlTag = xmlTag;
        return this;
    }

    public MultiSelectDropdown createMultiSelectDropdown() {
        if(selectedIndices == null)
        {
            Log.v("Multi","Selected indices in builder = null");
        }
        else
        {
            Log.v("Multi","Selected indices in builder is not null");
        }
        return new MultiSelectDropdown(title, items, itemUid,selectedIndices, columnName, tableName, rowno,xmlTag);
    }
}