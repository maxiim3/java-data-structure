function BlogPost(title, body, author) {
	this.title = title;
	this.body = body;
	this.author = author;

	this.views = 0;
	this.isLive = false;

	this.comment = function (author2) {
		return `
	my comment
		`
	}

	this.post = function () {
		return `
		${this.body}

		Title: ${this.title},
		Author: ${this.author}
		---------------
		${this.comment}
		`
	}
}

const blogPost = new BlogPost("Mickael", " yess", "meee")

