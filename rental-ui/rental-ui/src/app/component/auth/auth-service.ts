import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { environment } from '../../../environments/envornment';
import { Login } from '../model/login';
import { Router } from '@angular/router';

@Injectable({
    providedIn: 'root',
})
export class AuthService {

    loggedIn = new BehaviorSubject<boolean>(false);

    baseUrl: string = `${environment.apiUrl}rnt/`;

    constructor(private http: HttpClient, private router: Router) { }

    get isLoggedIn() {
        return this.loggedIn.asObservable(); // {2}
    }

    logout() {
        if (typeof sessionStorage !== "undefined") {
            sessionStorage.removeItem("token");
            this.router.navigate(["/auth/login"]);
        }
    }

    login(user: Login): Observable<any> {
        return this.http.post(this.baseUrl + "auth/login", user);
    }

    refreshToken(token: any): Observable<any> {
        return this.http.post(this.baseUrl + "auth/refreshToken", token);
    }

}