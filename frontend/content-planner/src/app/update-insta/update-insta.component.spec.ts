import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateInstaComponent } from './update-insta.component';

describe('UpdateInstaComponent', () => {
  let component: UpdateInstaComponent;
  let fixture: ComponentFixture<UpdateInstaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateInstaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateInstaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
