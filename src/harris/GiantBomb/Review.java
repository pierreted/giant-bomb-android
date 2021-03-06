package harris.GiantBomb;

public class Review implements Comparable<Review> {
	private GBObject game;
	private String link;
	private String content;
	private String reviewer;
	private int score;
	
	public Review() {
		game = new GBObject();
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setGame(GBObject game) {
		this.game = game;
	}

	/**
	 * @return the title
	 */
	public GBObject getGame() {
		return game;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	@Override
	public int compareTo(Review another) {
		if (game.getName() == another.getGame().getName())
			return 1;
		return 0;
	}

	public Review copy() {
		Review copy = new Review();
		copy.game = game.clone();
		copy.link = link;
		copy.content = content;
		copy.score = score;
		copy.reviewer = reviewer;
		return copy;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param reviewer the reviewer to set
	 */
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	/**
	 * @return the reviewer
	 */
	public String getReviewer() {
		return reviewer;
	}
}
