import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Book} from "./dto/book";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  bookList: Array<Book> = [];

  constructor(private http: HttpClient) {
    http.get<Array<Book>>('http://localhost:8080/api/v1/books')
      .subscribe(bookList => this.bookList = bookList);
  }
}
