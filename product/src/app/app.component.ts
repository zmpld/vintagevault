import { Component } from '@angular/core';
import { UserStorageService } from './services/storage/user-storage.service';
import { Router, NavigationEnd } from '@angular/router';
import { filter } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'product';

  isCustomerLoggedIn : boolean = UserStorageService.isCustomerLoggedIn();
  isAdminLoggedIn : boolean = UserStorageService.isAdminLoggedIn();
  currentUrl: string = '';

  constructor(private router: Router) { }
    
    ngOnInit(): void {
      this.router.events.pipe(
        filter(event => event instanceof NavigationEnd)
      ).subscribe((event: NavigationEnd) => {
        this.currentUrl = event.url;
        this.isCustomerLoggedIn = UserStorageService.isCustomerLoggedIn();
        this.isAdminLoggedIn = UserStorageService.isAdminLoggedIn();
      })
    }

  isOnLandingPage(): boolean {
    return this.currentUrl === '/' || this.currentUrl === '';
  }

  logout() {
    UserStorageService.signOut();
    this.router.navigateByUrl('login');
  }
}
