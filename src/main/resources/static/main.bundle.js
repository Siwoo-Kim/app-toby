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

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n\n<app-header></app-header>\n<app-location></app-location>\n\n<div class=\"page-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center\">\n  <p class=\"sub-header\" >\n    SubHeader\n  </p>\n  <h1 class=\"display-4\">Siwoo Kim</h1>\n  <p class=\"lead\">Page Header</p>\n</div>\n\n<div class=\"container\">\n  <router-outlet></router-outlet>\n  <a routerLink=\"/document/create\">C</a>\n</div>\n<app-footer></app-footer>\n\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_document_repository_service__ = __webpack_require__("./src/app/services/document-repository.service.ts");
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
    function AppComponent(documentRepository) {
        this.documentRepository = documentRepository;
    }
    AppComponent.prototype.ngOnInit = function () {
        console.log(this.documentRepository.documents);
    };
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("./src/app/app.component.html"),
            styles: [__webpack_require__("./src/app/app.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_document_repository_service__["a" /* DocumentRepository */]])
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
                __WEBPACK_IMPORTED_MODULE_6__angular_router__["a" /* RouterModule */].forRoot(routes),
                /*  Angular module  */
                __WEBPACK_IMPORTED_MODULE_5__angular_http__["b" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
            ],
            providers: [
                { provide: __WEBPACK_IMPORTED_MODULE_9__app_tokens__["a" /* PROTOCOL_TOKEN */], useValue: 'http' }
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
                __WEBPACK_IMPORTED_MODULE_5__angular_router__["a" /* RouterModule */].forChild(routes)
            ],
            declarations: [
                __WEBPACK_IMPORTED_MODULE_3__components_document_list_document_list_component__["a" /* DocumentListComponent */],
                __WEBPACK_IMPORTED_MODULE_4__components_document_create_document_create_component__["a" /* DocumentCreateComponent */]
            ],
            exports: [__WEBPACK_IMPORTED_MODULE_5__angular_router__["a" /* RouterModule */]],
        })
    ], DocumentModule);
    return DocumentModule;
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
            console.log(data);
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
        this.backendUrl = protocol + "://localhost:8080/";
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

/***/ "./src/app/services/service.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ServiceModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__document_repository_service__ = __webpack_require__("./src/app/services/document-repository.service.ts");
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
                __WEBPACK_IMPORTED_MODULE_1__rest_datasource_servics__["a" /* RestDatasourceService */],
                __WEBPACK_IMPORTED_MODULE_2__document_repository_service__["a" /* DocumentRepository */],
            ],
        })
    ], ServiceModule);
    return ServiceModule;
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

module.exports = "\r\n.box-shadow {\r\n  -webkit-box-shadow: -2px 2px 24px -5px rgba(0,0,0,0.49);\r\n  box-shadow: -2px 2px 24px -5px rgba(0,0,0,0.49);\r\n}\r\n\r\ndiv i {\r\n  margin-top: 18px !important;\r\n}\r\n"

/***/ }),

/***/ "./src/app/shared/header/header.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"d-flex flex-column flex-md-row align-items-center p-1 px-md-4 mb-1 bg-white border-bottom box-shadow\">\n  <h5 class=\"my-0 mr-md-auto font-weight-normal mb-1\">\n    <div class=\"ui icon header\">\n      <i class=\"github square icon\"></i>\n    </div>\n  </h5>\n\n  <nav class=\"my-2 my-md-0 mr-md-3\">\n    <div class=\"ui stackable menu\">\n      <a class=\"item\"\n                *ngFor=\"let project of projects\"\n                (click)=\"getProject(project.name)\"\n                [href]=\"project.url\"><i class=\"fa\" [ngClass]=\"project.icon\"></i>&nbsp;{{ project.name }}</a>\n      <a class=\"item\" routerLink=\"/document/create\" routerLinkActive=\"active\">Create Document (enabled)</a>\n      <a class=\"item\">About Me</a>\n      <a class=\"item\">Contact</a>\n\n    </div>\n\n\n  </nav>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/header/header.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HeaderComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_rest_datasource_servics__ = __webpack_require__("./src/app/services/rest-datasource.servics.ts");
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
    function HeaderComponent(datasource) {
        var _this = this;
        this.datasource = datasource;
        this.projects = [];
        this.datasource.get('project').subscribe(function (data) {
            _this.projects = data;
            console.log(_this.projects);
        });
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent.prototype.getProject = function (name) {
        console.log(this.datasource.get('project', [{ param: 'name', value: name }]));
    };
    HeaderComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-header',
            template: __webpack_require__("./src/app/shared/header/header.component.html"),
            styles: [__webpack_require__("./src/app/shared/header/header.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_rest_datasource_servics__["a" /* RestDatasourceService */]])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ "./src/app/shared/location/location.component.css":
/***/ (function(module, exports) {

module.exports = ".attached.label {\r\n  height: 60px;\r\n  position: relative;\r\n}\r\n\r\nh6 {\r\n  padding-top: 10px !important;\r\n}\r\n\r\ni {\r\n  margin-left: 1em;\r\n  margin-right: 1em;\r\n}\r\n"

/***/ }),

/***/ "./src/app/shared/location/location.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div class=\"ui label attached top mt-2\">\n  <h6 class=\"ui header grey ml-5 mt-1\"> 프로젝트<i class=\"fa fa-caret-right\"></i>언어 </h6>\n</div>\n"

/***/ }),

/***/ "./src/app/shared/location/location.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LocationComponent; });
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

var LocationComponent = /** @class */ (function () {
    function LocationComponent() {
    }
    LocationComponent.prototype.ngOnInit = function () {
    };
    LocationComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-location',
            template: __webpack_require__("./src/app/shared/location/location.component.html"),
            styles: [__webpack_require__("./src/app/shared/location/location.component.css")]
        }),
        __metadata("design:paramtypes", [])
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

module.exports = "<div class=\"card-deck mb-3 text-center\">\n  <div class=\"card mb-4 box-shadow\">\n    <div class=\"box-list clearfix\">\n      <div class=\"row\">\n        <div class=\"box-list-item text-center col-4\" >\n          <div class=\"box-item\">\n            <figure>\n              <div class=\"figure-inner\">\n                <img width=\"400\" height=\"400\" src=\"/assets/img/web_icon_1.jpg\"\n                     alt=\"web_icon_4\">\n              </div>\n            </figure>\n            <div class=\"detail-area\">\n              <p >Hello</p>\n            </div>\n          </div>\n        </div>\n        <div class=\"box-list-item text-center col-4\" >\n          <div class=\"box-item\">\n            <figure>\n              <div class=\"figure-inner\">\n                <img  width=\"400\" height=\"400\" src=\"/assets/img/web_icon_2.jpg\"\n                      alt=\"web_icon_4\">\n              </div>\n            </figure>\n            <div class=\"detail-area\">\n              <p >Hello</p>\n            </div>\n          </div>\n        </div>\n        <div class=\"box-list-item text-center col-4\" >\n          <div class=\"box-item\">\n            <figure>\n              <div class=\"figure-inner\">\n                <img  width=\"400\" height=\"400\"src=\"/assets/img/web_icon_3.jpg\"\n                      alt=\"web_icon_4\">\n              </div>\n            </figure>\n            <div class=\"detail-area\">\n              <p >Hello</p>\n            </div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n</div>\n"

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
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["a" /* MatButtonModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["c" /* MatInputModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["b" /* MatFormFieldModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["d" /* MatSelectModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_common__["b" /* CommonModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_platform_browser_animations__["a" /* BrowserAnimationsModule */],
                __WEBPACK_IMPORTED_MODULE_9__angular_router__["a" /* RouterModule */],
            ],
            exports: [
                __WEBPACK_IMPORTED_MODULE_1__footer_footer_component__["a" /* FooterComponent */],
                __WEBPACK_IMPORTED_MODULE_2__bottom_bottom_component__["a" /* BottomComponent */],
                __WEBPACK_IMPORTED_MODULE_3__header_header_component__["a" /* HeaderComponent */],
                __WEBPACK_IMPORTED_MODULE_6__location_location_component__["a" /* LocationComponent */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["c" /* MatInputModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["b" /* MatFormFieldModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["d" /* MatSelectModule */],
                __WEBPACK_IMPORTED_MODULE_8__angular_material__["a" /* MatButtonModule */],
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