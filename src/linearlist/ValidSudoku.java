package linearlist;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		boolean used[] = new boolean[9];
		for (int i = 0; i < 9; i++) {
			setAlltoFalse(used, 9);
			for (int j = 0; j < 9; j++)
				if (check(board[i][j], used))
					return false;
			setAlltoFalse(used, 9);
			for (int j = 0; j < 9; j++)
				if (check(board[j][i], used))
					return false;
		}
		for (int r = 0; r < 3; ++r)
			// 检查 9 个子格子
			for (int c = 0; c < 3; ++c) {
				setAlltoFalse(used, 9);
				for (int i = r * 3; i < r * 3 + 3; ++i)
					for (int j = c * 3; j < c * 3 + 3; ++j)
						if (check(board[i][j], used))
							return false;
			}
		return true;
	}

	public boolean check(char ch, boolean[] used) {
		if (ch == '.')
			return false;
		if (used[ch - '1'])
			return true;
		else{
			used[ch-'1'] = true;
			return false;
		}

	}

	public void setAlltoFalse(boolean[] flag, int n) {
		for (int i = 0; i < n; i++)
			flag[i] = false;
	}

	public static void main(String[] args) {
	}
}
