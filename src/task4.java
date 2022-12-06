import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int desk = 8;
        char[][] chessDesk = new char[desk][desk];
        for (int i = 0; i < desk; i++){
            Arrays.fill(chessDesk[i], '-');
        }
        Ferz(chessDesk, 0);
    }
    private static boolean check(char[][] desk, int r, int c)
    {
        for (int i = 0; i < r; i++)
        {
            if (desk[i][c] == 'F') {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
        {
            if (desk[i][j] == 'F') {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j < desk.length; i--, j++)
        {
            if (desk[i][j] == 'F') {
                return false;
            }
        }
        return true;
    }
    private static void showRes(char[][] desk)
    {
        for (char[] chars: desk) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }
    private static void Ferz(char[][] desk, int r)
    {
        if (r == desk.length)
        {
            showRes(desk);
            return;
        }
        for (int i = 0; i < desk.length; i++)
        {
            if (check(desk, r, i))
            {
                desk[r][i] = 'F';
                Ferz(desk, r + 1);
                desk[r][i] = '–';
            }
        }
    }
}
