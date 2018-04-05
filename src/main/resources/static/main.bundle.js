webpackJsonp(["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n\n<app-header></app-header>\n<app-location></app-location>\n<app-about-page></app-about-page>\n\n\n<div class=\"container-fluid\">\n  <router-outlet></router-outlet>\n  <a routerLink=\"/document/create\">C</a>\n</div>\n<app-footer></app-footer>\n\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
    }
    AppComponent.prototype.ngOnInit = function () { };
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("./src/app/app.component.html"),
            styles: [__webpack_require__("./src/app/app.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_component__ = __webpack_require__("./src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__shared_share_module__ = __webpack_require__("./src/app/shared/share.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_service_module__ = __webpack_require__("./src/app/services/service.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__shared_main_main_component__ = __webpack_require__("./src/app/shared/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__document_document_module__ = __webpack_require__("./src/app/document/document.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__app_tokens__ = __webpack_require__("./src/app/app.tokens.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__project_project_module__ = __webpack_require__("./src/app/project/project.module.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};











var routes = [
    { path: '', component: __WEBPACK_IMPORTED_MODULE_7__shared_main_main_component__["a" /* MainComponent */] },
    { path: 'home', component: __WEBPACK_IMPORTED_MODULE_7__shared_main_main_component__["a" /* MainComponent */] },
];
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["K" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */]
            ],
            imports: [
                /*  App module  */
                __WEBPACK_IMPORTED_MODULE_3__shared_share_module__["a" /* ShareModule */],
                __WEBPACK_IMPORTED_MODULE_4__services_service_module__["a" /* ServiceModule */],
                __WEBPACK_IMPORTED_MODULE_8__document_document_module__["a" /* DocumentModule */],
                __WEBPACK_IMPORTED_MODULE_10__project_project_module__["a" /* ProjectModule */],
                __WEBPACK_IMPORTED_MODULE_6__angular_router__["c" /* RouterModule */].forRoot(routes),
                /*  Angular module  */
                __WEBPACK_IMPORTED_MODULE_5__angular_http__["b" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
            ],
            providers: [
                { provide: __WEBPACK_IMPORTED_MODULE_9__app_tokens__["a" /* PROTOCOL_TOKEN */], useValue: 'https' },
            ],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/app.tokens.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PROTOCOL_TOKEN; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");

var PROTOCOL_TOKEN = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* InjectionToken */]('protocol');


/***/ }),

/***/ "./src/app/document/components/document-create/document-create.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/document/components/document-create/document-create.component.html":
/***/ (function(module, exports) {

module.exports = "<form class=\"ui form\"\n      [formGroup]=\"form\"\n      novalidate\n      (ngSubmit)=\"submitForm()\">\n  <h4 class=\"ui dividing header\">Creating Document</h4>\n  <div class=\"field\">\n    <div class=\"two fields\">\n      <mat-form-field class=\"field\">\n        <label>Title</label>\n        <input type=\"text\"\n               matInput\n               name=\"title\"\n               formControlName=\"title\"\n               [(ngModel)]=\"document.title\">\n        <mat-hint>Enter Title</mat-hint>\n        <mat-error>Error</mat-error>\n      </mat-form-field>\n      <mat-form-field class=\"field\">\n        <label>Subtitle</label>\n        <input type=\"text\"\n               matInput\n               name=\"subtitle\"\n               formControlName=\"subtitle\"\n               [(ngModel)]=\"document.subtitle\">\n        <mat-hint>Enter subtitle</mat-hint>\n        <mat-error>Error</mat-error>\n      </mat-form-field>\n    </div>\n    <div class=\"two fields\">\n      <mat-form-field class=\"field\">\n        <label>User</label>\n        <input type=\"text\" matInput disabled name=\"user\">\n        <mat-hint>User Information</mat-hint>\n        <mat-error>Error</mat-error>\n      </mat-form-field>\n      <mat-form-field class=\"field\">\n        <label>Section</label>\n        <mat-select class=\"ui fluid dropdown mt-4\">\n          <mat-option *ngFor=\"let dummy of ['1','2','3']\" value=\"dummy\"> {{ dummy }}</mat-option>\n        </mat-select>\n      </mat-form-field>\n    </div>\n  </div>\n  <div class=\"field\">\n    <label>Description</label>\n    <textarea\n      rows=\"2\"\n      name=\"description\"\n      formControlName=\"description\"\n      [(ngModel)]=\"document.description\"\n    ></textarea>\n  </div>\n  <div class=\"field\">\n    <label>content</label>\n    <mat-form-field class=\"field\"\n                    style=\"width: 100%\">\n      <textarea\n        matInput\n        rows=\"20\"\n        name=\"content\"\n        formControlName=\"content\"\n        [(ngModel)]=\"document.content\"\n      ></textarea>\n      <mat-error>Error</mat-error>\n    </mat-form-field>\n  </div>\n  <div class=\"ui segment\">\n    <div class=\"field\">\n      <div class=\"ui toggle checkbox\">\n        <input type=\"checkbox\" name=\"private\" >\n        <label>Post as private</label>\n      </div>\n    </div>\n  </div>\n  <button mat-raised-button type=\"submit\" class=\"btn-block\" >Create</button>\n</form>\n"

/***/ }),

/***/ "./src/app/document/components/document-create/document-create.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DocumentCreateComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_forms__ = __webpack_require__("./node_modules/@angular/forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__models_document_model__ = __webpack_require__("./src/app/models/document.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var DocumentCreateComponent = /** @class */ (function () {
    function DocumentCreateComponent() {
        this.submitted = false;
    }
    DocumentCreateComponent.prototype.ngOnInit = function () {
        this.document = new __WEBPACK_IMPORTED_MODULE_2__models_document_model__["a" /* Document */]();
        this.form = new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["c" /* FormGroup */]({
            'title': new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */]('', __WEBPACK_IMPORTED_MODULE_1__angular_forms__["k" /* Validators */].compose([__WEBPACK_IMPORTED_MODULE_1__angular_forms__["k" /* Validators */].required, __WEBPACK_IMPORTED_MODULE_1__angular_forms__["k" /* Validators */].minLength(5)])),
            'subtitle': new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */](),
            'section': new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */](),
            'user': new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */](),
            'description': new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */](),
            'content': new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */]('', __WEBPACK_IMPORTED_MODULE_1__angular_forms__["k" /* Validators */].compose([__WEBPACK_IMPORTED_MODULE_1__angular_forms__["k" /* Validators */].required, __WEBPACK_IMPORTED_MODULE_1__angular_forms__["k" /* Validators */].minLength(5)]))
        });
    };
    DocumentCreateComponent.prototype.submitForm = function () {
        this.submitted = true;
        if (this.form.valid) {
            console.log(this.document);
            this.form.reset();
            this.document = new __WEBPACK_IMPORTED_MODULE_2__models_document_model__["a" /* Document */]();
        }
    };
    DocumentCreateComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-document-create',
            template: __webpack_require__("./src/app/document/components/document-create/document-create.component.html"),
            styles: [__webpack_require__("./src/app/document/components/document-create/document-create.component.css")]
        })
    ], DocumentCreateComponent);
    return DocumentCreateComponent;
}());



/***/ }),

/***/ "./src/app/document/components/document-list/document-list.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/document/components/document-list/document-list.component.html":
/***/ (function(module, exports) {

module.exports = "<p>\n  document-list works!\n</p>\n"

/***/ }),

/***/ "./src/app/document/components/document-list/document-list.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DocumentListComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var DocumentListComponent = /** @class */ (function () {
    function DocumentListComponent() {
    }
    DocumentListComponent.prototype.ngOnInit = function () {
    };
    DocumentListComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-document-list',
            template: __webpack_require__("./src/app/document/components/document-list/document-list.component.html"),
            styles: [__webpack_require__("./src/app/document/components/document-list/document-list.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], DocumentListComponent);
    return DocumentListComponent;
}());



/***/ }),

/***/ "./src/app/document/document.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DocumentModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common__ = __webpack_require__("./node_modules/@angular/common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_share_module__ = __webpack_require__("./src/app/shared/share.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__components_document_list_document_list_component__ = __webpack_require__("./src/app/document/components/document-list/document-list.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__components_document_create_document_create_component__ = __webpack_require__("./src/app/document/components/document-create/document-create.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_forms__ = __webpack_require__("./node_modules/@angular/forms/esm5/forms.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};







var routes = [
    { path: 'document/create', component: __WEBPACK_IMPORTED_MODULE_4__components_document_create_document_create_component__["a" /* DocumentCreateComponent */] }
];
var DocumentModule = /** @class */ (function () {
    function DocumentModule() {
    }
    DocumentModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["K" /* NgModule */])({
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_common__["b" /* CommonModule */],
                __WEBPACK_IMPORTED_MODULE_6__angular_forms__["e" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_6__angular_forms__["j" /* ReactiveFormsModule */],
                __WEBPACK_IMPORTED_MODULE_2__shared_share_module__["a" /* ShareModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_router__["c" /* RouterModule */].forChild(routes)
            ],
            declarations: [
                __WEBPACK_IMPORTED_MODULE_3__components_document_list_document_list_component__["a" /* DocumentListComponent */],
                __WEBPACK_IMPORTED_MODULE_4__components_document_create_document_create_component__["a" /* DocumentCreateComponent */]
            ],
            exports: [__WEBPACK_IMPORTED_MODULE_5__angular_router__["c" /* RouterModule */]],
        })
    ], DocumentModule);
    return DocumentModule;
}());



/***/ }),

/***/ "./src/app/models/chapter.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Chapter; });
var Chapter = /** @class */ (function () {
    function Chapter(title, description, childs) {
        this.title = title;
        this.description = description;
        this.childs = childs;
    }
    return Chapter;
}());



/***/ }),

/***/ "./src/app/models/document.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export Resources */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Document; });
var Resources = /** @class */ (function () {
    function Resources(key, url) {
        this.key = key;
        this.url = url;
    }
    return Resources;
}());

var Document = /** @class */ (function () {
    function Document(id, title, subtitle, description, content, owner, section, basicTime, hit, resources) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.content = content;
        this.owner = owner;
        this.section = section;
        this.basicTime = basicTime;
        this.hit = hit;
        this.resources = resources;
    }
    return Document;
}());



/***/ }),

/***/ "./src/app/models/page-state.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return Page; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "c", function() { return PageState; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PAGE_STATE; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");

var Page;
(function (Page) {
    Page[Page["HOME"] = 0] = "HOME";
    Page[Page["PROJECT"] = 1] = "PROJECT";
    Page[Page["DOCUMENT"] = 2] = "DOCUMENT";
    Page[Page["SECTION"] = 3] = "SECTION";
})(Page || (Page = {}));
var PageState = /** @class */ (function () {
    function PageState(page, url) {
        this.page = page;
        this.url = url;
    }
    return PageState;
}());

var PAGE_STATE = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* InjectionToken */]('page_state');


/***/ }),

/***/ "./src/app/models/project.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Project; });
var Project = /** @class */ (function () {
    function Project(id, name, type, icon, url, lastUpdatedSection, description, basicTime) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.icon = icon;
        this.url = url;
        this.lastUpdatedSection = lastUpdatedSection;
        this.description = description;
        this.basicTime = basicTime;
    }
    return Project;
}());



/***/ }),

/***/ "./src/app/project/project-main/project-main.component.css":
/***/ (function(module, exports) {

module.exports = "\r\n.main-wrapper {\r\n  margin-top: 20px;\r\n}\r\n\r\n.left-side {\r\n  position: relative;\r\n  padding: 0 1px 0 0;\r\n  margin: 0;\r\n  border: 0;\r\n  outline: 0;\r\n  font-size: 100%;\r\n  vertical-align: baseline;\r\n}\r\n\r\n.left-side .item {\r\n  padding: 8px 15px;\r\n  line-height: 14px;\r\n  color: #999;\r\n  display: block;\r\n}\r\n\r\n.main-content {\r\n  font-family: NanumGothic,sans-serif;\r\n  line-height: 1.8;\r\n  font-size: 1.1em;\r\n  padding: 10px;\r\n  color: #666;\r\n}\r\n\r\n.main-content > p {\r\n  margin: 1em 0;\r\n}\r\n\r\n.main-header {\r\n  padding-bottom: 1em;\r\n  margin-bottom: 2em;\r\n  position: relative !important;\r\n  text-align: center !important;\r\n  line-height: 1.8;\r\n}\r\n\r\n.main-content-wrapper .props {\r\n  color: #999;\r\n  font-size: .95em;\r\n  margin: .5em .5em 0 .2em;\r\n}\r\n"

/***/ }),

/***/ "./src/app/project/project-main/project-main.component.html":
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"ui grid stackable container-fluid\">\n  <div class=\"row\" >\n    <app-project-sidebar [project]=\"project\" ></app-project-sidebar>\n    <div class=\"ui thirteen wide column\">\n      <div class=\"main-header\">\n        <h3 class=\"header dividing ui\">\n          {{ project.name }}\n        </h3>\n        <div class=\"props\" *ngIf=\"project.basicTime\">\n          {{ ( project.basicTime.updated || project.basicTime.created || Date() ) }} | 공개\n        </div>\n      </div>\n\n      <app-data-loader *ngIf=\"!projectSummary\"></app-data-loader>\n      <div class=\"ui message\" *ngIf=\"projectSummary\">\n        Project Type : <i class=\"ui icon html5\" [ngClass]=\"{'cloudversify' : project.type == 'BACKEND'}\"></i>{{ projectSummary.type }}\n        <br>\n        Last updated of time for section is {{ project.lastUpdatedSection || 'Not Recent' }}.\n      </div>\n\n      <div class=\"main-content\">\n        <p>\n          {{ project.description }}\n        </p>\n      </div>\n\n      <app-list-chapter *ngIf=\"projectSummary\" [chapters]=\"chapters\" [title]=\"project.name\"></app-list-chapter>\n\n      <div class=\"ui relaxed divided list\">\n        <h5 class=\"\"> 예제 코드 </h5>\n        <div class=\"item\">\n          <i class=\"large github middle aligned icon\"></i>\n          <div class=\"content\">\n            <a class=\"header\">Document1</a>\n            <div class=\"description\">Document1 URL</div>\n          </div>\n        </div>\n        <div class=\"item\">\n          <i class=\"large github middle aligned icon\"></i>\n          <div class=\"content\">\n            <a class=\"header\">Document2</a>\n            <div class=\"description\">Document2 URL</div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/project/project-main/project-main.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProjectMainComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_project_repository_service__ = __webpack_require__("./src/app/services/project-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_section_repository_service__ = __webpack_require__("./src/app/services/section-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__models_chapter_model__ = __webpack_require__("./src/app/models/chapter.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ProjectMainComponent = /** @class */ (function () {
    function ProjectMainComponent(productRepository, sectionRepository, route) {
        var _this = this;
        this.productRepository = productRepository;
        this.sectionRepository = sectionRepository;
        this.route = route;
        this.chapters = [];
        this.route.params.subscribe(function (params) {
            var projectName = params['name'];
            _this.project = _this.productRepository.getProjectByName(projectName);
            _this.productRepository.currentProject = _this.project;
        });
        this.productRepository.changeCurrentProjectEmitter.subscribe(function (project) { return _this.init(project); });
    }
    ProjectMainComponent.prototype.ngOnInit = function () {
    };
    ProjectMainComponent.prototype.init = function (project) {
        var _this = this;
        this.productRepository.getProjectSummary(this.project.id).subscribe(function (data) {
            _this.projectSummary = data;
            _this.chapters = [];
            var sectionChapter = [];
            for (var _i = 0, _a = _this.projectSummary.sectionNames; _i < _a.length; _i++) {
                var sectionName = _a[_i];
                sectionChapter.push(new __WEBPACK_IMPORTED_MODULE_4__models_chapter_model__["a" /* Chapter */](sectionName, ''));
            }
            _this.chapters.push(new __WEBPACK_IMPORTED_MODULE_4__models_chapter_model__["a" /* Chapter */](_this.project.name, _this.project.description, sectionChapter));
        });
    };
    ProjectMainComponent.prototype.getDocumentTitleByName = function (sectionName) {
        var titles = [];
        for (var _i = 0, _a = Object.keys(this.projectSummary.documentTitles); _i < _a.length; _i++) {
            var _sectionName = _a[_i];
            if (_sectionName == sectionName) {
                titles = this.projectSummary.documentTitles[_sectionName];
                console.log(titles);
            }
        }
        return titles;
    };
    ProjectMainComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-project-main',
            template: __webpack_require__("./src/app/project/project-main/project-main.component.html"),
            styles: [__webpack_require__("./src/app/project/project-main/project-main.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_project_repository_service__["a" /* ProjectRepository */],
            __WEBPACK_IMPORTED_MODULE_3__services_section_repository_service__["a" /* SectionRepository */],
            __WEBPACK_IMPORTED_MODULE_2__angular_router__["a" /* ActivatedRoute */]])
    ], ProjectMainComponent);
    return ProjectMainComponent;
}());



/***/ }),

/***/ "./src/app/project/project-main/project-sidebar/project-sidebar.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/project/project-main/project-sidebar/project-sidebar.component.html":
/***/ (function(module, exports) {

module.exports = "\n<app-data-loader class=\"ui three wide column pl-3\" *ngIf=\"!currentProject\"></app-data-loader>\n<div class=\"ui three wide column pl-3\" *ngIf=\"!hasSection\" >\n  <div class=\"ui vertical menu\">\n    <div class=\"item\">\n      <div class=\"menu\">\n        <a class=\"ui item\">\n          <div class=\"ui negative message\">\n            <i class=\"close icon\" (click)=\"hasSection = true\"></i>\n            <div class=\"header\">\n              I'am sorry. I will bring content, soon!\n            </div>\n            <p>Empty section and titles</p>\n          </div>\n          <a class=\"ui item\"\n             [attr.data-tooltip]=\"'No Section! '\"\n             [attr.data-position]=\"'right center'\">\n          </a>\n        </a>\n      </div>\n    </div>\n  </div>\n</div>\n<div class=\"ui three wide column pl-3\" *ngIf=\"currentProject && hasSection\">\n  <div class=\"ui vertical menu\">\n    <div class=\"item\"\n         *ngFor=\"let section of projectSummary.sectionNames\"\n         (mouseover)=\"selectedSection = section\"\n         [ngClass]=\"{'active teal': selectedSection == section}\">\n      <div class=\"ui left pointing label\"\n           [ngClass]=\"{'active teal': selectedSection == section}\">\n        {{ getDocumentTitleByName(section).length }}\n      </div>\n      <div class=\"header\">{{ section }}</div>\n      <div class=\"menu\">\n        <a class=\"ui item\"\n           id=\"side-anchor\"\n           [attr.data-tooltip]=\"section + ' Section! '\"\n           [attr.data-position]=\"'right center'\"\n           *ngFor=\"let documentTitle of getDocumentTitleByName(section)\">\n          {{ documentTitle }}\n        </a>\n      </div>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/project/project-main/project-sidebar/project-sidebar.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProjectSidebarComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_project_repository_service__ = __webpack_require__("./src/app/services/project-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__models_project_model__ = __webpack_require__("./src/app/models/project.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ProjectSidebarComponent = /** @class */ (function () {
    function ProjectSidebarComponent(projectRepository) {
        this.projectRepository = projectRepository;
    }
    Object.defineProperty(ProjectSidebarComponent.prototype, "project", {
        set: function (project) {
            var _this = this;
            this.currentProject = project;
            this.projectRepository.getProjectSummary(this.currentProject.id).subscribe(function (data) {
                _this.projectSummary = data;
                _this.hasSection = _this.projectSummary.sectionNames.length > 0;
            });
        },
        enumerable: true,
        configurable: true
    });
    ProjectSidebarComponent.prototype.ngOnInit = function () {
    };
    ProjectSidebarComponent.prototype.getDocumentTitleByName = function (sectionName) {
        var titles = [];
        for (var _i = 0, _a = Object.keys(this.projectSummary.documentTitles); _i < _a.length; _i++) {
            var _sectionName = _a[_i];
            if (_sectionName == sectionName) {
                titles = this.projectSummary.documentTitles[_sectionName];
            }
        }
        return titles;
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__models_project_model__["a" /* Project */]),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__models_project_model__["a" /* Project */]])
    ], ProjectSidebarComponent.prototype, "project", null);
    ProjectSidebarComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-project-sidebar',
            template: __webpack_require__("./src/app/project/project-main/project-sidebar/project-sidebar.component.html"),
            styles: [__webpack_require__("./src/app/project/project-main/project-sidebar/project-sidebar.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_project_repository_service__["a" /* ProjectRepository */]])
    ], ProjectSidebarComponent);
    return ProjectSidebarComponent;
}());



/***/ }),

/***/ "./src/app/project/project.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProjectModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common__ = __webpack_require__("./node_modules/@angular/common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__project_main_project_main_component__ = __webpack_require__("./src/app/project/project-main/project-main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__shared_share_module__ = __webpack_require__("./src/app/shared/share.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_service_module__ = __webpack_require__("./src/app/services/service.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__project_main_project_sidebar_project_sidebar_component__ = __webpack_require__("./src/app/project/project-main/project-sidebar/project-sidebar.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};







var routes = [
    { path: 'project', children: [
            { path: ':name', component: __WEBPACK_IMPORTED_MODULE_2__project_main_project_main_component__["a" /* ProjectMainComponent */] }
        ]
    }
];
var ProjectModule = /** @class */ (function () {
    function ProjectModule() {
    }
    ProjectModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["K" /* NgModule */])({
            imports: [
                __WEBPACK_IMPORTED_MODULE_5__services_service_module__["a" /* ServiceModule */],
                __WEBPACK_IMPORTED_MODULE_4__shared_share_module__["a" /* ShareModule */],
                __WEBPACK_IMPORTED_MODULE_1__angular_common__["b" /* CommonModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_router__["c" /* RouterModule */].forChild(routes),
            ],
            declarations: [
                __WEBPACK_IMPORTED_MODULE_2__project_main_project_main_component__["a" /* ProjectMainComponent */],
                __WEBPACK_IMPORTED_MODULE_6__project_main_project_sidebar_project_sidebar_component__["a" /* ProjectSidebarComponent */],
            ],
            exports: [
                __WEBPACK_IMPORTED_MODULE_2__project_main_project_main_component__["a" /* ProjectMainComponent */],
                __WEBPACK_IMPORTED_MODULE_3__angular_router__["c" /* RouterModule */]
            ],
        })
    ], ProjectModule);
    return ProjectModule;
}());



/***/ }),

/***/ "./src/app/services/document-repository.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DocumentRepository; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var DocumentRepository = /** @class */ (function () {
    function DocumentRepository(dataSource) {
        var _this = this;
        this.dataSource = dataSource;
        this._documents = [];
        this.dataSource.get('document').subscribe(function (data) {
            _this._documents = data;
        });
    }
    Object.defineProperty(DocumentRepository.prototype, "documents", {
        get: function () {
            return this._documents.slice();
        },
        enumerable: true,
        configurable: true
    });
    DocumentRepository = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__["a" /* RestDatasourceService */]])
    ], DocumentRepository);
    return DocumentRepository;
}());



/***/ }),

/***/ "./src/app/services/project-repository.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProjectRepository; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ProjectRepository = /** @class */ (function () {
    function ProjectRepository(dataSource) {
        var _this = this;
        this.dataSource = dataSource;
        this._projects = [];
        this.changeCurrentProjectEmitter = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
        this.dataSource.get('project').subscribe(function (data) {
            _this._projects = data;
        });
    }
    Object.defineProperty(ProjectRepository.prototype, "currentProject", {
        get: function () {
            return this._currentProject;
        },
        set: function (project) {
            this.changeCurrentProjectEmitter.emit(project);
            this._currentProject = project;
        },
        enumerable: true,
        configurable: true
    });
    ProjectRepository.prototype.getProject = function (id) {
        return this._projects.find(function (_project) { return _project.id == id; });
    };
    ProjectRepository.prototype.getProjects = function () {
        return this.dataSource.get('project');
    };
    ProjectRepository.prototype.getProjectByName = function (name) {
        return name != null ?
            this._projects.find(function (pro) { return pro.name.toLowerCase() == name.toLowerCase(); }) : null;
    };
    ProjectRepository.prototype.getProjectSummary = function (projectId) {
        return this.dataSource.get("project/summary/" + projectId);
    };
    ProjectRepository.prototype.getProjectSummaryByName = function (projectName) {
        var id = this._projects.filter(function (_project) { return _project.name == projectName; }).map(function (_project) { return _project.id; })[0];
        return this.getProjectSummary(id);
    };
    ProjectRepository = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__["a" /* RestDatasourceService */]])
    ], ProjectRepository);
    return ProjectRepository;
}());



/***/ }),

/***/ "./src/app/services/rest-datasource.servics.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RestDatasourceService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Rx__ = __webpack_require__("./node_modules/rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__app_tokens__ = __webpack_require__("./src/app/app.tokens.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};




var RestDatasourceService = /** @class */ (function () {
    function RestDatasourceService(http, protocol) {
        this.http = http;
        this.protocol = protocol;
        if (this.protocol == 'http') {
            this.backendUrl = protocol + "://" + location.hostname + ":8080/";
        }
        else {
            this.backendUrl = protocol + "://" + location.hostname + "/";
        }
    }
    RestDatasourceService.prototype.get = function (url, params) {
        var queryParam = null;
        if (params) {
            for (var _i = 0, params_1 = params; _i < params_1.length; _i++) {
                var p = params_1[_i];
                queryParam.set(p.param, p.value);
            }
        }
        return this.request(__WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* RequestMethod */].Get, url, queryParam);
    };
    RestDatasourceService.prototype.request = function (method, url, params, body) {
        var req = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* Request */]({
            method: method,
            url: this.backendUrl + url,
            params: params,
            body: body
        });
        return this.http.request(req).map(function (res) { return res.json(); });
    };
    RestDatasourceService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __param(1, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Inject */])(__WEBPACK_IMPORTED_MODULE_3__app_tokens__["a" /* PROTOCOL_TOKEN */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Http */], String])
    ], RestDatasourceService);
    return RestDatasourceService;
}());



/***/ }),

/***/ "./src/app/services/section-repository.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SectionRepository; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SectionRepository = /** @class */ (function () {
    function SectionRepository(dataSource) {
        this.dataSource = dataSource;
    }
    SectionRepository.prototype.getSectionByProject = function (projectName) {
        return this.dataSource.get("section/project/" + projectName);
    };
    SectionRepository = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__["a" /* RestDatasourceService */]])
    ], SectionRepository);
    return SectionRepository;
}());



/***/ }),

/***/ "./src/app/services/service.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ServiceModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__document_repository_service__ = __webpack_require__("./src/app/services/document-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__project_repository_service__ = __webpack_require__("./src/app/services/project-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__section_repository_service__ = __webpack_require__("./src/app/services/section-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__static_datasource_service__ = __webpack_require__("./src/app/services/static-datasource.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_rxjs_Subject__ = __webpack_require__("./node_modules/rxjs/_esm5/Subject.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__models_page_state_model__ = __webpack_require__("./src/app/models/page-state.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__webpage_repository_service__ = __webpack_require__("./src/app/services/webpage-repository.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};









var ServiceModule = /** @class */ (function () {
    function ServiceModule() {
    }
    ServiceModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["K" /* NgModule */])({
            providers: [
                __WEBPACK_IMPORTED_MODULE_5__static_datasource_service__["a" /* StaticDatasourceService */],
                __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__["a" /* RestDatasourceService */],
                /*  App Repository  */
                __WEBPACK_IMPORTED_MODULE_2__document_repository_service__["a" /* DocumentRepository */],
                __WEBPACK_IMPORTED_MODULE_3__project_repository_service__["a" /* ProjectRepository */],
                __WEBPACK_IMPORTED_MODULE_8__webpage_repository_service__["a" /* WebPageRepository */],
                __WEBPACK_IMPORTED_MODULE_4__section_repository_service__["a" /* SectionRepository */],
                { provide: __WEBPACK_IMPORTED_MODULE_7__models_page_state_model__["a" /* PAGE_STATE */], useValue: new __WEBPACK_IMPORTED_MODULE_6_rxjs_Subject__["b" /* Subject */]() }
            ],
        })
    ], ServiceModule);
    return ServiceModule;
}());



/***/ }),

/***/ "./src/app/services/static-datasource.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StaticDatasourceService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__ = __webpack_require__("./node_modules/rxjs/_esm5/Observable.js");

var CASE;
(function (CASE) {
    CASE[CASE["PROJECT"] = 0] = "PROJECT";
    CASE[CASE["PROJECTSUMMARY"] = 1] = "PROJECTSUMMARY";
    CASE[CASE["SECTION"] = 2] = "SECTION";
    CASE[CASE["DOCUMENT"] = 3] = "DOCUMENT";
    CASE[CASE["WEBPAGE"] = 4] = "WEBPAGE";
})(CASE || (CASE = {}));
var StaticDatasourceService = /** @class */ (function () {
    function StaticDatasourceService() {
        this.webpages = [
            {
                "name": "Project",
                "imgNames": [
                    "project_icon_1",
                    "project_icon_2",
                    "project_icon_3"
                ],
                "author": {
                    "id": 1,
                    "name": {
                        "first": "Siwoo",
                        "middle": null,
                        "last": "Kim"
                    },
                    "email": "sm123tt@gmail.com",
                    "password": null,
                    "joinDate": null,
                    "login": 0,
                    "recommend": 0,
                    "level": "GOLD",
                    "point": 0
                },
                "description": "프로젝트란 우리말로 목표정도로 번역 할 수 있을 것 같습니다. 어떤 목표를 달성하기 위해서 많은 사람이 협력합니다. 이 과정에서 소위 막장이라고 부르는 상황들이 발생합니다. 그리고 이런 막장은 어느정도는 숙명과도 같은 것입니다. 하지만 막장은 줄일 수 있습니다. 행복한 프로젝트는 아니더라도 프로젝트를 덜 불행하게 만들수는 있습니다. 이를 위한 많은 도구들이 있고 프로젝트 관리편에서는 이 도구들을 소개해드립니다.",
                "url": "http://www.localhost.com:8080/project",
            },
            {
                "name": "Home",
                "imgNames": [
                    "home_icon_1",
                    "home_icon_2"
                ],
                "author": {
                    "id": 1,
                    "name": {
                        "first": "Siwoo",
                        "middle": null,
                        "last": "Kim"
                    },
                    "email": "sm123tt@gmail.com",
                    "password": null,
                    "joinDate": null,
                    "login": 0,
                    "recommend": 0,
                    "level": "GOLD",
                    "point": 0
                },
                "description": "온라인용 포트폴리오입니다. 사회에 첫발을 내딛기 위한 정말로, 가장 처음으로 만든 포트폴리오라 할 수 있을 것 같습니다. 영원할 것 같던 대학시절이 끝나고 있습니다. 만감이 교차하는 마음으로 준비했던 포트폴리오입니다.",
                "url": "http://www.localhost.com:8080/home",
            },
            {
                "name": "Section",
                "imgNames": [
                    "section_icon_1",
                    "section_icon_2"
                ],
                "author": {
                    "id": 1,
                    "name": {
                        "first": "Siwoo",
                        "middle": null,
                        "last": "Kim"
                    },
                    "email": "sm123tt@gmail.com",
                    "password": null,
                    "joinDate": null,
                    "login": 0,
                    "recommend": 0,
                    "level": "GOLD",
                    "point": 0
                },
                "description": "프로그래밍을 처음 시작하는 분들의 눈높이에 맞게 만들어진 강의입니다. 이미 프로그래밍에 익숙한 분의 입장에서는 설명이 조금 장황할 수 있습니다.",
                "url": "http://www.localhost.com:8080/section",
            },
            {
                "name": "Document",
                "imgNames": [
                    "document_icon_1",
                    "document_icon_2"
                ],
                "author": {
                    "id": 1,
                    "name": {
                        "first": "Siwoo",
                        "middle": null,
                        "last": "Kim"
                    },
                    "email": "sm123tt@gmail.com",
                    "password": null,
                    "joinDate": null,
                    "login": 0,
                    "recommend": 0,
                    "level": "GOLD",
                    "point": 0
                },
                "description": "주력 웹 페이지 프로그래밍의 정보를 담고있는, 처음인 분들을 위해서 고안된 수업입니다. WEBn을 통해서 교양으로 코딩을 공부하려는 분들에게는 출구를, 직업으로 코딩을 공부하려는 분들에게는 입구를 제공해드리려고 노력하고 있습니다. 웹이라는 구체적인 사례를 통해서 코딩이 무엇인가 파악해보세요. 또 코딩을 통해서 웹을 만드는 방법을 공부해보세요. ",
                "url": "http://www.localhost.com:8080/document",
            }
        ];
        this.projects = [
            {
                "id": 1,
                "name": "Java",
                "type": "BACKEND",
                "icon": "android",
                "url": "http://www.localhost.com:8080/java",
                "description": "Java SE(Java Platform, Standard Edition)는 자바의 표준안이다. 자바라는 언어가 어떠한 문법적인 구성을 가졌는지와 같은 것들을 정의하고 있다. 이것은 구체적인 소프트웨어가 아니고 그 소프트웨어의 설계도라고 할 수 있다. 소프트웨어에서는 설계도라는 표현 대신에 명세서(spec, specification)이라는 말을 사용한다. 이 명세서에 따라서 Java가 만들어지게 된다. Java SE 7은 버전 7에 대한 명세서이다. 자바는 계속 진화하고 있는 기술이다. 이 명세서는 JCP(Java Community Process, http://jcp.org)라는 조직을 통해서 만들어진다.",
            },
            {
                "id": 2,
                "name": "Javascript",
                "type": "BACKEND",
                "icon": "android",
                "url": "http://www.localhost.com:8080/java",
                "description": "Java SE(Java Platform, Standard Edition)는 자바의 표준안이다. 자바라는 언어가 어떠한 문법적인 구성을 가졌는지와 같은 것들을 정의하고 있다. 이것은 구체적인 소프트웨어가 아니고 그 소프트웨어의 설계도라고 할 수 있다. 소프트웨어에서는 설계도라는 표현 대신에 명세서(spec, specification)이라는 말을 사용한다. 이 명세서에 따라서 Java가 만들어지게 된다. Java SE 7은 버전 7에 대한 명세서이다. 자바는 계속 진화하고 있는 기술이다. 이 명세서는 JCP(Java Community Process, http://jcp.org)라는 조직을 통해서 만들어진다.",
            },
            {
                "id": 3,
                "name": "java3",
                "type": "BACKEND",
                "icon": "android",
                "url": "http://www.localhost.com:8080/java",
                "description": "Java SE(Java Platform, Standard Edition)는 자바의 표준안이다. 자바라는 언어가 어떠한 문법적인 구성을 가졌는지와 같은 것들을 정의하고 있다. 이것은 구체적인 소프트웨어가 아니고 그 소프트웨어의 설계도라고 할 수 있다. 소프트웨어에서는 설계도라는 표현 대신에 명세서(spec, specification)이라는 말을 사용한다. 이 명세서에 따라서 Java가 만들어지게 된다. Java SE 7은 버전 7에 대한 명세서이다. 자바는 계속 진화하고 있는 기술이다. 이 명세서는 JCP(Java Community Process, http://jcp.org)라는 조직을 통해서 만들어진다.",
            },
            {
                "id": 4,
                "name": "java4",
                "type": "BACKEND",
                "icon": "android",
                "url": "http://www.localhost.com:8080/java",
                "description": "Java SE(Java Platform, Standard Edition)는 자바의 표준안이다. 자바라는 언어가 어떠한 문법적인 구성을 가졌는지와 같은 것들을 정의하고 있다. 이것은 구체적인 소프트웨어가 아니고 그 소프트웨어의 설계도라고 할 수 있다. 소프트웨어에서는 설계도라는 표현 대신에 명세서(spec, specification)이라는 말을 사용한다. 이 명세서에 따라서 Java가 만들어지게 된다. Java SE 7은 버전 7에 대한 명세서이다. 자바는 계속 진화하고 있는 기술이다. 이 명세서는 JCP(Java Community Process, http://jcp.org)라는 조직을 통해서 만들어진다.",
            },
        ];
        this.projectSummary = [
            {
                "name": "Java",
                "type": "BACKEND",
                "sectionNames": [
                    "주석과 세미콜론",
                    "JAVA 설치",
                    "데이터 타입",
                    "숫자와 문자",
                    "변수"
                ],
                "documentTitles": {
                    "주석과 세미콜론": [],
                    "데이터 타입": [],
                    "JAVA 설치": [
                        "변수",
                        "데이터 타입",
                        "상수",
                        "메소드",
                        "언어소개",
                        "함수지향",
                        "클로저"
                    ],
                    "숫자와 문자": [
                        "변수",
                        "데이터 타입",
                        "상수",
                        "메소드",
                        "언어소개",
                        "함수지향",
                        "클로저"
                    ],
                    "변수": [],
                }
            },
            {
                "name": "Java",
                "type": "BACKEND",
                "sectionNames": [
                    "주석과 세미콜론",
                    "JAVA 설치",
                    "데이터 타입",
                    "숫자와 문자",
                    "변수"
                ],
                "documentTitles": {
                    "주석과 세미콜론": [],
                    "데이터 타입": [],
                    "JAVA 설치": [
                        "변수",
                        "데이터 타입",
                        "상수",
                        "메소드",
                        "언어소개",
                        "함수지향",
                        "클로저"
                    ],
                    "숫자와 문자": [
                        "변수",
                        "데이터 타입",
                        "상수",
                        "메소드",
                        "언어소개",
                        "함수지향",
                        "클로저"
                    ],
                    "변수": [],
                }
            }
        ];
        this.sections = [{
                "id": 1,
                "name": "JAVA 설치",
                "difficulty": 0,
                "description": "자바로 프로그램을 만들기 위해서는 아래와 같은 과정이 필요하다. 코드 작성 컴퓨터가 실행할 수 있는 형태로 코드를 컴파일 컴파일된 프로그램을 실행",
                "project": {
                    "id": 1
                },
            },
            {
                "id": 2,
                "name": "숫자와 문자",
                "difficulty": 0,
                "description": "프로그래밍 입문자에게 가장 익숙한 데이터 타입(data type)은 숫자와 문자일 것이다. 이번 시간에는 실제로 가장 많이 사용되는 데이터 형인 문자와 숫자를 프로그래밍에서는 어떻게 표현하고 연산하는지 알아보자.",
                "project": {
                    "id": 1,
                }
            },
            {
                "id": 3,
                "name": "변수",
                "difficulty": 0,
                "description": "영어로는 Variable로 (문자나 숫자 같은) 데이터를 담는 컨테이너다. 여기에 담겨진 데이터는 다른 데이터로 바꿀 수 있다. 변수는 마치 (사람이 쓰는 언어인) 자연어에서 대명사와 비슷한 역할을 한다.",
                "project": {
                    "id": 1,
                }
            },
            {
                "id": 4,
                "name": "주석과 세미콜론",
                "difficulty": 0,
                "description": "주석(comment)은 로직에 대한 설명이나 코드를 비활성화 할 때 사용한다. 주석은 프로그래밍적으로 해석되지 않는다.",
                "project": {
                    "id": 2,
                }
            },
            {
                "id": 5,
                "name": "데이터 타입",
                "difficulty": 0,
                "description": "데이터 타입은 조금 어렵다. 후속 수업에서 필수적인 선행지식은 아니지만, 또 뒤에 배치하는 것도 애매하다. 이번 토픽의 학습이 어렵게 느껴지면 다음 토픽으로 넘어가고 나중에 다시 학습하면 된다. 데이터 타입에 대해서 자세히 알아보기 전에 데이터의 크기에 대해서 학습하자.",
                "project": {
                    "id": 2,
                }
            }];
        this.documents = [
            {
                "id": 1,
                "title": "변수",
                "subtitle": null,
                "description": "다음 예제는 변수에 값을 대입하는 방법을 보여주는 예제다.",
                "content": "위의 구문은 변수 a를 지금부터 사용하겠다고 변수를 선언한 것이다. 변수 a 앞에는 int라는 키워드가 있다. 이 키워드는 integer의 약자로 한국어로는 정수라는 의미다. 정수는 0을 중심으로 -1, -2, -3과 같은 음수와 1, 2, 3과 같은 양수를 통틀어서 정수라고 한다. 위의 코드는 변수 a가 정수를 담는 그릇임을 명시한 것이다. 이 변수를 사용하는 입장에서는 이 변수 안에 들어있는 데이터가 틀림 없이 정수라는 것을 확신 할 수 있게 된다. a = 1; 좌항의 변수 a의 데이터가 1이라는 의미다. a에 숫자 1을 대입한 것이다. 이제부터 a 안에는 1이 들어있다. 이러한 것을 변수 a에 숫자 1을 할당했다고 한다. 위의 실습 결과는 각각 2와 3이 출력될 것이다. 변수 a에 담겨 있는 값이 1일 때는 a+1의 결과가 2가 된다. 두번째 결과가 3이 된 것은 a의 값이 2로 바뀌었고, 2+1의 결과인 3이 출력된 것이다. //은 주석(comment)으로 코드에 부가적인 설명을 쓰거나 사용하지 않는 코드를 비활성화시키기 위해서 사용한다. 뒤에 따라오는 내용은 해석되지 않는다. 세미콜론(;)은 하나의 구문이 끝났음을 명시적으로 나타내는 기호다. 다음처럼 한줄에 여러구문을 사용하고 싶을 때 세미콜론이 유용하다. int a; a = 1; System.out.println(a+1); //2 a = 2; System.out.println(a+1); //3 자바에서는 세미콜론을 생략할 수 없다.",
                "owner": null,
                "section": null,
                "hit": 0,
                "resources": [
                    { "key": "추가정보3", "url": new URL("http://www.localhost.com:8080/notExits3") },
                    { "key": "추가정보3", "url": new URL("http://www.localhost.com:8080/notExits3") },
                    { "key": "추가정보3", "url": new URL("http://www.localhost.com:8080/notExits3") },
                ]
            },
            {
                "id": 2,
                "title": "데이터 타입",
                "subtitle": "데이터의 크기",
                "description": "데이터 타입은 조금 어렵다. 후속 수업에서 필수적인 선행지식은 아니지만, 또 뒤에 배치하는 것도 애매하다. 이번 토픽의 학습이 어렵게 느껴지면 다음 토픽으로 넘어가고 나중에 다시 학습하면 된다.",
                "content": "byte a; 이 변수에 담을 수 있는 숫자의 범위는 -128~127까지다. 이 범위 밖의 수인 -129나 128을 변수에 대입하려고 하면 오류가 발생할 것이다. 그럼 매우 큰 표현범위를 가지고 있는 long형을 사용하지 왜 byte 형을 사용할까? 만약 표현하고자 하는 수가 많아봐야 100을 넘지 않는 경우가 있다고 생각해보자. 행정구역을 숫자로 표시한다고 가정해보자.즉 어떤 숫자를 저장하느냐에 따라서 사용하는 메모리의 크기가 달라지는 것이 아니고, 어떤 데이터 타입으로 변수를 선언했느냐에 따라서 사용하는 메모리의 크기가 달라지는 것이다. 결국, 변수에 들어올 수 있는 숫자의 최대 크기를 잘 판단해서 데이터 타입을 지정해야 귀한 메모리의 용량을 아낄 수 있다. 하지만 오늘날은 메모리의 용량이 늘어났고, 또 어떤 데이터형을 사용할 것이냐는 문제를 판단하기 위해서는 여러 가지가 고려되어야 한다. 결과적으로 말해서 정수를 저장할 때는 int를 사용하면 된다. int 형을 처리 할 때 CPU의 처리속도가 빠르고, int는 충분히 큰 수를 표현할 수 있는 데이터 타입이기 때문이다.",
                "owner": null,
                "section": null,
                "hit": 0,
                "resources": [
                    { "key": "추가정보3", "url": new URL("http://www.localhost.com:8080/notExits3") },
                    { "key": "추가정보3", "url": new URL("http://www.localhost.com:8080/notExits3") },
                    { "key": "추가정보3", "url": new URL("http://www.localhost.com:8080/notExits3") },
                ]
            }
        ];
    }
    // 'project'
    // `project/summary/${projectId}`
    // 'document'
    //  section/project/projectName`
    StaticDatasourceService.prototype.analzyUrl = function (url) {
        if (url.startsWith('webpage')) {
            console.log(url.substr('webpage'.length, url.length));
            return CASE.WEBPAGE;
        }
        if (url.startsWith('project/summary')) {
            return CASE.PROJECTSUMMARY;
        }
        if (url.startsWith('project')) {
            return CASE.PROJECT;
        }
        if (url.startsWith('document')) {
            return CASE.DOCUMENT;
        }
        if (url.startsWith('section')) {
            return CASE.SECTION;
        }
        return null;
    };
    StaticDatasourceService.prototype.get = function (url, params) {
        var _case = this.analzyUrl(url);
        switch (_case) {
            case CASE.WEBPAGE: {
                return __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__["a" /* Observable */].from([this.webpages[0]]);
            }
            case CASE.PROJECTSUMMARY: return __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__["a" /* Observable */].from([this.projectSummary[0]]);
            case CASE.PROJECT: return __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__["a" /* Observable */].from([this.projects]);
            case CASE.DOCUMENT: return __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__["a" /* Observable */].from([this.documents]);
            case CASE.SECTION: return __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__["a" /* Observable */].from([this.sections]);
        }
        return __WEBPACK_IMPORTED_MODULE_0_rxjs_Observable__["a" /* Observable */].from([]);
    };
    return StaticDatasourceService;
}());



/***/ }),

/***/ "./src/app/services/webpage-repository.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return WebPageRepository; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var WebPageRepository = /** @class */ (function () {
    function WebPageRepository(restDatesource) {
        this.restDatesource = restDatesource;
    }
    WebPageRepository.prototype.getByName = function (name) {
        return this.restDatesource.get("webpage/" + name);
    };
    WebPageRepository = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__["a" /* RestDatasourceService */]])
    ], WebPageRepository);
    return WebPageRepository;
}());



/***/ }),

/***/ "./src/app/shared/about-page/about-page.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/shared/about-page/about-page.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div id=\"about-page-wrapper\" class=\"page-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center\" *ngIf=\"webPage\" >\n  <p class=\"sub-header\" >\n    About Page by {{ webPage.author.name.first }}\n  </p>\n  <h1 class=\"ui header dividing\" style=\"font-size: 3em\">\n    {{ webPage.name }}\n    <img class=\"ui large image\" src=\"/assets/img/home/webpage_icon1.png\">\n    <div class=\"sub header p-5\" style=\"font-family: 'Ubuntu', sans-serif\">\n      {{ webPage.description }}\n    </div>\n  </h1>\n  <div class=\"ui message m-5\">\n    <i class=\"ui code icon\"></i>\n    <div class=\"content\">\n      <div class=\"header\">\n        Are you Coding everyday?\n      </div>\n      <p>If you want to be better, do it right now</p>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/about-page/about-page.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AboutPageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_page_state_model__ = __webpack_require__("./src/app/models/page-state.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__("./node_modules/rxjs/_esm5/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_webpage_repository_service__ = __webpack_require__("./src/app/services/webpage-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};





var AboutPageComponent = /** @class */ (function () {
    function AboutPageComponent(pageStates, route, webPageRepository) {
        var _this = this;
        this.pageStates = pageStates;
        this.route = route;
        this.webPageRepository = webPageRepository;
        this.pageStateSubscription = this.pageStates.subscribe(function (pageState) {
            _this.webPageRepository.getByName(__WEBPACK_IMPORTED_MODULE_1__models_page_state_model__["b" /* Page */][pageState.page]).subscribe(function (data) {
                _this.webPage = data;
                _this.toggleHost();
            });
        });
    }
    AboutPageComponent.prototype.toggleHost = function () {
        $('#about-page-wrapper').animate({
            opacity: 0,
        }, 1000);
        $('#about-page-wrapper').animate({
            opacity: 1,
        }, 1000);
    };
    ;
    AboutPageComponent.prototype.ngOnDestroy = function () {
        this.pageStateSubscription.unsubscribe();
    };
    AboutPageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-about-page',
            template: __webpack_require__("./src/app/shared/about-page/about-page.component.html"),
            styles: [__webpack_require__("./src/app/shared/about-page/about-page.component.css")]
        }),
        __param(0, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Inject */])(__WEBPACK_IMPORTED_MODULE_1__models_page_state_model__["a" /* PAGE_STATE */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["a" /* Observable */],
            __WEBPACK_IMPORTED_MODULE_4__angular_router__["a" /* ActivatedRoute */],
            __WEBPACK_IMPORTED_MODULE_3__services_webpage_repository_service__["a" /* WebPageRepository */]])
    ], AboutPageComponent);
    return AboutPageComponent;
}());



/***/ }),

/***/ "./src/app/shared/bottom/bottom.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/shared/bottom/bottom.component.html":
/***/ (function(module, exports) {

module.exports = "<p>\n  bottom works!\n</p>\n"

/***/ }),

/***/ "./src/app/shared/bottom/bottom.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return BottomComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var BottomComponent = /** @class */ (function () {
    function BottomComponent() {
    }
    BottomComponent.prototype.ngOnInit = function () {
    };
    BottomComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-bottom',
            template: __webpack_require__("./src/app/shared/bottom/bottom.component.html"),
            styles: [__webpack_require__("./src/app/shared/bottom/bottom.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], BottomComponent);
    return BottomComponent;
}());



/***/ }),

/***/ "./src/app/shared/components/data-loader/data-loader.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/shared/components/data-loader/data-loader.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"ui segment\" *ngIf=\"!maxentry\">\n  <div class=\"ui active inverted dimmer\">\n    <div class=\"ui text large loader\">Fetching Data...</div>\n  </div>\n</div>\n\n"

/***/ }),

/***/ "./src/app/shared/components/data-loader/data-loader.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DataLoaderComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var DataLoaderComponent = /** @class */ (function () {
    function DataLoaderComponent() {
        var _this = this;
        this.maxentry = false;
        setTimeout(function () {
            _this.maxentry = true;
        }, 3000);
    }
    DataLoaderComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-data-loader',
            template: __webpack_require__("./src/app/shared/components/data-loader/data-loader.component.html"),
            styles: [__webpack_require__("./src/app/shared/components/data-loader/data-loader.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], DataLoaderComponent);
    return DataLoaderComponent;
}());



/***/ }),

/***/ "./src/app/shared/components/list-chapter/list-chapter-item/list-chapter-item.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/shared/components/list-chapter/list-chapter-item/list-chapter-item.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div class=\"ui list mt-2\">\n  <div class=\"item\">\n    <i class=\"folder icon\"></i>\n    <div class=\"content\">\n      <div class=\"header\">{{ chapter.title }}</div>\n      <div class=\"description\">{{ chapter.description }}</div>\n      <ng-template *ngIf=\"chapter.childs\" ></ng-template>\n      <app-list-item\n        *ngFor=\"let chapter_child of chapter.childs\"\n        [chapter]=\"chapter_child\"\n      ></app-list-item>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/components/list-chapter/list-chapter-item/list-chapter-item.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ListChapterItemComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_chapter_model__ = __webpack_require__("./src/app/models/chapter.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ListChapterItemComponent = /** @class */ (function () {
    function ListChapterItemComponent() {
    }
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__models_chapter_model__["a" /* Chapter */])
    ], ListChapterItemComponent.prototype, "chapter", void 0);
    ListChapterItemComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-list-item',
            template: __webpack_require__("./src/app/shared/components/list-chapter/list-chapter-item/list-chapter-item.component.html"),
            styles: [__webpack_require__("./src/app/shared/components/list-chapter/list-chapter-item/list-chapter-item.component.css")]
        })
    ], ListChapterItemComponent);
    return ListChapterItemComponent;
}());



/***/ }),

/***/ "./src/app/shared/components/list-chapter/list-chapter.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/shared/components/list-chapter/list-chapter.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"col-12 ml-4 mt-4\">\n    <h2 class=\"ui dividing header\">\n      {{ title }}\n      <a class=\"anchor\" id=\"components\"></a>\n    </h2>\n    <app-list-item *ngFor=\"let chapter of chapters\"\n                   [chapter]=\"chapter\"></app-list-item>\n</div>\n<hr>\n"

/***/ }),

/***/ "./src/app/shared/components/list-chapter/list-chapter.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ListChapterComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ListChapterComponent = /** @class */ (function () {
    function ListChapterComponent() {
    }
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", Array)
    ], ListChapterComponent.prototype, "chapters", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
        __metadata("design:type", String)
    ], ListChapterComponent.prototype, "title", void 0);
    ListChapterComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-list-chapter',
            template: __webpack_require__("./src/app/shared/components/list-chapter/list-chapter.component.html"),
            styles: [__webpack_require__("./src/app/shared/components/list-chapter/list-chapter.component.css")]
        })
    ], ListChapterComponent);
    return ListChapterComponent;
}());



/***/ }),

/***/ "./src/app/shared/footer/footer.component.css":
/***/ (function(module, exports) {

module.exports = "\r\nfooter {\r\n  text-align: center;\r\n}\r\n"

/***/ }),

/***/ "./src/app/shared/footer/footer.component.html":
/***/ (function(module, exports) {

module.exports = "<footer class=\"pt-4 my-md-5 pt-md-5 border-top\">\n  <div class=\"row\">\n    <div class=\"col-12 col-md\">\n      <img class=\"mb-2\" src=\"https://getbootstrap.com/assets/brand/bootstrap-solid.svg\" alt=\"\" width=\"24\" height=\"24\">\n      <small class=\"d-block mb-3 text-muted\">&copy; 2017-2018</small>\n    </div>\n    <div class=\"col-6 col-md\">\n      <h5>Features</h5>\n      <ul class=\"list-unstyled text-small\">\n        <li><a class=\"text-muted\" href=\"#\">Cool stuff</a></li>\n      </ul>\n    </div>\n    <div class=\"col-6 col-md\">\n      <h5>Resources</h5>\n      <ul class=\"list-unstyled text-small\">\n        <li><a class=\"text-muted\" href=\"#\">Resource</a></li>\n      </ul>\n    </div>\n    <div class=\"col-6 col-md\">\n      <h5>About</h5>\n      <ul class=\"list-unstyled text-small\">\n        <li><a class=\"text-muted\" href=\"#\">Team</a></li>\n      </ul>\n    </div>\n  </div>\n</footer>\n"

/***/ }),

/***/ "./src/app/shared/footer/footer.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FooterComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var FooterComponent = /** @class */ (function () {
    function FooterComponent() {
    }
    FooterComponent.prototype.ngOnInit = function () {
    };
    FooterComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-footer',
            template: __webpack_require__("./src/app/shared/footer/footer.component.html"),
            styles: [__webpack_require__("./src/app/shared/footer/footer.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], FooterComponent);
    return FooterComponent;
}());



/***/ }),

/***/ "./src/app/shared/header/header.component.css":
/***/ (function(module, exports) {

module.exports = "\r\n.shadow {\r\n  -webkit-box-shadow: 2px 6px 65px -6px rgba(0,0,0,0.75);\r\n  box-shadow: 2px 6px 65px -6px rgba(0,0,0,0.75);\r\n}\r\n\r\ni.icon {\r\n  height: 26px !important;\r\n  margin: 0 4px 3px 0 !important;\r\n}\r\n\r\n:host {\r\n  font-family: 'Nanum Pen Script', cursiv !important;\r\n  font-size: 1.5em !important;\r\n  z-index: 2 !important;\r\n  top: 0;\r\n  left: 0;\r\n  right: 0;\r\n  z-index: 2;\r\n}\r\n\r\nh1{\r\n  font-size: 1.8em !important;\r\n}\r\n\r\n.form-inline{\r\n  border-radius: 10px !important;\r\n}\r\n\r\n.header-wrapper{\r\n  background-color: #FFFFFF;\r\n  border: 1px solid #DDD;\r\n  -webkit-box-shadow: 0px 3px 5px rgba(0, 0, 0, 0.2);\r\n          box-shadow: 0px 3px 5px rgba(0, 0, 0, 0.2);\r\n}\r\n\r\n.form-inline input {\r\n  padding: 0.25rem 0.5rem !important;\r\n  font-size: 0.875rem !important;\r\n  line-height: 1.5 !important;\r\n  border-radius: 0.2rem !important;\r\n}\r\n\r\ni.search.icon {\r\n  top: 0.15em !important;\r\n  font-size: 0.875rem !important;\r\n  line-height: 1.5 !important;\r\n  border-radius: 0.2rem !important;\r\n}\r\n"

/***/ }),

/***/ "./src/app/shared/header/header.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"header-wrapper d-flex mb-1 flex-column flex-md-row align-items-center p-3 px-md-4 shadow\">\n  <h3 class=\"my-0 mr-md-auto font-weight-normal ui header\">\n    <a\n      [routerLink]=\"['/home']\"\n    ><i class=\"ui icon large github\"></i></a>\n  </h3>\n  <nav class=\"my-2 my-md-0 mr-md-3\">\n    <a\n      *ngFor=\"let project of projects\"\n      class=\"p-2\"\n      [routerLink]=\"['project',project.name]\"\n      routerLinkActive=\"active\"> {{ project.name }}</a>\n  </nav>\n  <a class=\"btn btn-outline-primary mr-2\"\n     mat-raised-button\n     (click)=\"onChangeModel('user')\">Contact</a>\n  <form class=\"form-inline ui icon input\">\n    <input\n      type=\"text\"\n      class=\"form-control-sm\"\n      placeholder=\"Search Document\">\n      <i class=\"inverted circular search link icon\"></i>\n  </form>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/header/header.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HeaderComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_project_repository_service__ = __webpack_require__("./src/app/services/project-repository.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var HeaderComponent = /** @class */ (function () {
    function HeaderComponent(projectRepository, route) {
        var _this = this;
        this.projectRepository = projectRepository;
        this.route = route;
        this.projects = [];
        $(document)
            .ready(function () {
            $('.ui.menu .ui.dropdown').dropdown({
                on: 'hover'
            });
            $('.ui.menu a.item')
                .on('click', function () {
                $(this)
                    .addClass('active')
                    .siblings()
                    .removeClass('active');
            });
        });
        this.projectRepository.getProjects().subscribe(function (data) {
            _this.projects = data;
        });
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent.prototype.getProject = function (name) {
        return this.projectRepository.getProjectByName(name);
    };
    HeaderComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-header',
            template: __webpack_require__("./src/app/shared/header/header.component.html"),
            styles: [__webpack_require__("./src/app/shared/header/header.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_project_repository_service__["a" /* ProjectRepository */],
            __WEBPACK_IMPORTED_MODULE_2__angular_router__["a" /* ActivatedRoute */]])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ "./src/app/shared/location/location.component.css":
/***/ (function(module, exports) {

module.exports = "\r\n.label {\r\n  position: relative !important;\r\n}\r\n\r\nh6 {\r\n  padding-top: 10px !important;\r\n}\r\n\r\ni {\r\n  margin-left: 1em;\r\n  margin-right: 1em;\r\n}\r\n"

/***/ }),

/***/ "./src/app/shared/location/location.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div class=\"ui bottom attached label\"  >\n  <div class=\"ui tiny breadcrumb\">\n    <a *ngFor=\"let url of urlSegments;let i= index;let _last = last\"\n       [routerLink]=\"tourl(i)\"\n       class=\"ui section\">\n      {{ url.trim().toUpperCase() }}\n      <i class=\"right chevron icon divider\" *ngIf=\"!_last\"></i>\n    </a>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/location/location.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LocationComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__models_page_state_model__ = __webpack_require__("./src/app/models/page-state.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};



var LocationComponent = /** @class */ (function () {
    function LocationComponent(route, router, pageStateObserver) {
        var _this = this;
        this.route = route;
        this.router = router;
        this.pageStateObserver = pageStateObserver;
        this.toSegments(this.router.url);
        this.changePageState();
        this.router.events.subscribe(function (event) {
            if (event['url'] != null) {
                var prevUrl = _this.url;
                _this.url = event['url'];
                _this.toSegments(_this.url);
                if (prevUrl != _this.url) {
                    _this.changePageState();
                }
            }
        });
    }
    LocationComponent.prototype.toSegments = function (url) {
        this.prevUrlSegments = this.urlSegments;
        this.urlSegments = [];
        var _urls = url.split('/');
        this.urlSegments = _urls.filter(function (url) {
            return url != null && url.length != 0 && url.trim() != "";
        });
    };
    LocationComponent.prototype.tourl = function (index) {
        var _urls = "";
        for (var i = 0; i < index + 1; i++) {
            _urls += "/" + this.urlSegments[i];
        }
        return _urls;
    };
    LocationComponent.prototype.changePageState = function () {
        if (this.prevUrlSegments != null && this.urlSegments[0] == this.prevUrlSegments[0]) {
            return;
        }
        if (this.urlSegments.length == 0 || this.urlSegments[0] == '') {
            this.pageStateObserver.next(new __WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["c" /* PageState */](__WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["b" /* Page */].HOME, this.url));
            return;
        }
        switch (this.urlSegments[0]) {
            case 'home':
                this.pageStateObserver.next(new __WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["c" /* PageState */](__WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["b" /* Page */].HOME, this.url));
                break;
            case 'project':
                console.log('project');
                this.pageStateObserver.next(new __WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["c" /* PageState */](__WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["b" /* Page */].PROJECT, this.url));
                break;
            case 'section':
                console.log('section');
                this.pageStateObserver.next(new __WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["c" /* PageState */](__WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["b" /* Page */].SECTION, this.url));
                break;
            case 'document':
                console.log('document');
                this.pageStateObserver.next(new __WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["c" /* PageState */](__WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["b" /* Page */].DOCUMENT, this.url));
                break;
        }
    };
    ;
    LocationComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-location',
            template: __webpack_require__("./src/app/shared/location/location.component.html"),
            styles: [__webpack_require__("./src/app/shared/location/location.component.css")]
        }),
        __param(2, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["B" /* Inject */])(__WEBPACK_IMPORTED_MODULE_2__models_page_state_model__["a" /* PAGE_STATE */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */],
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */], Object])
    ], LocationComponent);
    return LocationComponent;
}());



/***/ }),

/***/ "./src/app/shared/main/main.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/shared/main/main.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div class=\"ui vertical stripe segment mt-5\">\n  <div class=\"ui middle aligned stackable grid container\">\n    <div class=\"row\">\n      <div class=\"eight wide column\">\n        <h3 class=\"ui header\">How am I ? <i class=\"icon blind\"></i></h3>\n        <p>Seneca College Student, 2 Semester</p>\n        <h3 class=\"ui header\">What can you do? <i class=\"icon cube\"></i></h3>\n        <p class=\"ui text\">\n          Spring, Spring-boot, Java, Object oriented programming, Aspect oriented programming(AspectJ), Functional Programming with Java8 and Angular\n        </p>\n      </div>\n      <div class=\"four wide right floated column\">\n        <img src=\"assets/img/home/web_icon1.png\" class=\"ui large bordered rounded image\">\n      </div>\n    </div>\n  </div>\n</div>\n<div class=\"ui equal width stackable internally celled grid mt-5\">\n  <div class=\"center aligned row\">\n    <div class=\"column\">\n      <h3>\"Coding Everyday\"</h3>\n      <p>Practice Everyday to be better</p>\n    </div>\n    <div class=\"column\">\n      <h3>\"최근 공부하는것?\"</h3>\n      <p>\n        <img src=\"assets/img/home/web_icon_4.jpg\" class=\"ui avatar image\"> <b>JPA (Java Persistence Api) JPA 라 쓰고 하이버네이트라 읽는다.</b>\n      </p>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/main/main.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MainComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var MainComponent = /** @class */ (function () {
    function MainComponent() {
    }
    MainComponent.prototype.ngOnInit = function () {
    };
    MainComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-main',
            template: __webpack_require__("./src/app/shared/main/main.component.html"),
            styles: [__webpack_require__("./src/app/shared/main/main.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], MainComponent);
    return MainComponent;
}());



/***/ }),

/***/ "./src/app/shared/share.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ShareModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__footer_footer_component__ = __webpack_require__("./src/app/shared/footer/footer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__bottom_bottom_component__ = __webpack_require__("./src/app/shared/bottom/bottom.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__header_header_component__ = __webpack_require__("./src/app/shared/header/header.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_common__ = __webpack_require__("./node_modules/@angular/common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_platform_browser_animations__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/animations.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__location_location_component__ = __webpack_require__("./src/app/shared/location/location.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__main_main_component__ = __webpack_require__("./src/app/shared/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__angular_material__ = __webpack_require__("./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__components_list_chapter_list_chapter_component__ = __webpack_require__("./src/app/shared/components/list-chapter/list-chapter.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__components_list_chapter_list_chapter_item_list_chapter_item_component__ = __webpack_require__("./src/app/shared/components/list-chapter/list-chapter-item/list-chapter-item.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__components_data_loader_data_loader_component__ = __webpack_require__("./src/app/shared/components/data-loader/data-loader.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__about_page_about_page_component__ = __webpack_require__("./src/app/shared/about-page/about-page.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};














var ShareModule = /** @class */ (function () {
    function ShareModule() {
    }
    ShareModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["K" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_1__footer_footer_component__["a" /* FooterComponent */],
                __WEBPACK_IMPORTED_MODULE_2__bottom_bottom_component__["a" /* BottomComponent */],
                __WEBPACK_IMPORTED_MODULE_3__header_header_component__["a" /* HeaderComponent */],
                __WEBPACK_IMPORTED_MODULE_6__location_location_component__["a" /* LocationComponent */],
                __WEBPACK_IMPORTED_MODULE_7__main_main_component__["a" /* MainComponent */],
                __WEBPACK_IMPORTED_MODULE_10__components_list_chapter_list_chapter_component__["a" /* ListChapterComponent */],
                __WEBPACK_IMPORTED_MODULE_11__components_list_chapter_list_chapter_item_list_chapter_item_component__["a" /* ListChapterItemComponent */],
                __WEBPACK_IMPORTED_MODULE_12__components_data_loader_data_loader_component__["a" /* DataLoaderComponent */],
                __WEBPACK_IMPORTED_MODULE_13__about_page_about_page_component__["a" /* AboutPageComponent */],
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["a" /* MatButtonModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["c" /* MatInputModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["b" /* MatFormFieldModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["e" /* MatSelectModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["d" /* MatMenuModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_common__["b" /* CommonModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_platform_browser_animations__["a" /* BrowserAnimationsModule */],
                __WEBPACK_IMPORTED_MODULE_9__angular_router__["c" /* RouterModule */],
            ],
            exports: [
                __WEBPACK_IMPORTED_MODULE_1__footer_footer_component__["a" /* FooterComponent */],
                __WEBPACK_IMPORTED_MODULE_2__bottom_bottom_component__["a" /* BottomComponent */],
                __WEBPACK_IMPORTED_MODULE_3__header_header_component__["a" /* HeaderComponent */],
                __WEBPACK_IMPORTED_MODULE_6__location_location_component__["a" /* LocationComponent */],
                __WEBPACK_IMPORTED_MODULE_10__components_list_chapter_list_chapter_component__["a" /* ListChapterComponent */],
                __WEBPACK_IMPORTED_MODULE_11__components_list_chapter_list_chapter_item_list_chapter_item_component__["a" /* ListChapterItemComponent */],
                __WEBPACK_IMPORTED_MODULE_12__components_data_loader_data_loader_component__["a" /* DataLoaderComponent */],
                __WEBPACK_IMPORTED_MODULE_13__about_page_about_page_component__["a" /* AboutPageComponent */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["c" /* MatInputModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["b" /* MatFormFieldModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["e" /* MatSelectModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["a" /* MatButtonModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["d" /* MatMenuModule */],
            ]
        })
    ], ShareModule);
    return ShareModule;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};


/***/ }),

/***/ "./src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("./node_modules/@angular/platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_hammerjs__ = __webpack_require__("./node_modules/hammerjs/hammer.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_hammerjs___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_hammerjs__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__app_app_module__ = __webpack_require__("./src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__environments_environment__ = __webpack_require__("./src/environments/environment.ts");





if (__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_17" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_3__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("./src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map