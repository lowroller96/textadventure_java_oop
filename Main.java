//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import services.DateiEinlesen;

public class Main {
    public static void main(String[] args) {
//        Story story = new Story("Du fällst in eine Schlangengrube",-20, 0,true);
//    Story story = new Story();
        DateiEinlesen dateieinlesen = new DateiEinlesen();
        dateieinlesen.getArrayListGeschichte();
        dateieinlesen.getArrayListRaetsel();
//     System.out.println(story.getAuswirkungGesundheit());
        //story.setAuswirkungGesundheit(2);
        //story.getAuswirkungGesundheit();
    }
}

// 1. Welche Unterschied zwischen StoryNagativ und StoryPositiv?
// 2. Gleiche Sache mit Figure Class. z.B. boolean steurt isBöse(oder isGefährlich)