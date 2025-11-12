package Learning.Enum;

enum Status {
    SUCCESS(200),//objects  of enum Status  eg Status SUCCESS=new Status(200);
    ERROR(500),
    NOT_FOUND(404);

    private int code;

    Status(int code) {
        // constructor (always private)
        this.code = code;
        System.out.println("Constructor of "+ this);
    }

    public int getCode() {
        return this.code;
    }
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;
        System.out.println(s);            // SUCCESS
        System.out.println(s.getCode());  // 200
    }
}
