/**
 * Created by admin on 2018/11/25.
 */
public class Main {

    static public void main(String[] args){

        Speaker speaker=new HelloWorldSpeaker();
        speaker.speak();


    }

    static class HelloWorldSpeaker implements Speaker{

        Speaker speaker;


        @Override
        public void speak() {
            this.speaker=new HelloSpeaker();
            this.speaker.speak();
            System.out.print("world");

        }
    }

    static class HelloSpeaker implements Speaker{

        @Override
        public void speak() {
            System.out.print("hello");
        }
    }
}
