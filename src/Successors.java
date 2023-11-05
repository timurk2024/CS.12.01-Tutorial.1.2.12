public class Successors {
    public static Position findPosition(int num, int[][] array2D)
    {
        for (int row = 0; row < array2D.length; row++)
        {
            for (int col = 0; col < array2D[0].length; col++)
            {
                if (array2D[row][col] == num)
                {
                    return new Position(row, col);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] array2D)
    {
        Position[][] successorArray = new Position[array2D.length][array2D[0].length];

        for (int row = 0; row < array2D.length; row++)
        {
            for (int col = 0; col < array2D[0].length; col++)
            {
                successorArray[row][col] = findPosition(array2D[row][col] + 1, array2D);
            }
        }
        return successorArray;
    }
}