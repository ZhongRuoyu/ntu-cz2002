package exam.ay1920s1.Q3b;

class Controller {
    public void accessItem(Account acc, String item_id, String action) {
        int result = -1;
        AccessRight ars[] = acc.getRights();
        for (AccessRight ar : ars) {
            result = ar.verify(item_id, action);
            if (result > -1) {
                break;
            }
        }
        switch (result) {
            case 0: {
                readItem(item_id);
                break;
            }
            case 1: {
                writeItem(item_id);
                break;
            }
            default: {
                displayError(result);
                break;
            }
        }
    }

    private void readItem(String item_id) {
        Viewer vw = new Viewer(item_id);
        System.out.println("readItem: " + item_id);
    }
    
    private void writeItem(String item_id) {
        System.out.println("writeItem: " + item_id);
    }

    private void displayError(int result) {
        System.out.println("displayError: " + result);
    }
}
