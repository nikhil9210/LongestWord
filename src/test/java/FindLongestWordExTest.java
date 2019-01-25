import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

    public class FindLongestWordExTest {

        @Test
        public void findLongestWord(){
          FindLongestWordEx ex = new FindLongestWordEx();
            String str[]= ex.findLongestWordAndLength("I like Mastercard Technologies");
            // assert statements
            assertEquals("12", str[0]);
            assertEquals("Technologies", str[1]);

        }

        @Test
        public void findLongestWord_negative(){
            FindLongestWordEx ex = new FindLongestWordEx();
            String str[]= ex.findLongestWordAndLength("I like Mastercard Technologies");
            // assert statements
            assertEquals("10", str[0]);
            assertEquals("like", str[1]);

        }
    }

