package gov.open.opengov;

import java.util.ArrayList;
import java.util.List;

public class RecallList  {
    private List<Recall> recalls;

    public RecallList() {
        recalls = new ArrayList<Recall>();
    }

    public List<Recall> getRecalls() {
        return recalls;
    }

    public void setRecalls(List<Recall> recalls) {
        this.recalls = recalls;
    }
}