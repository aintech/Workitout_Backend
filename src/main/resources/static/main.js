(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error('Cannot find module "' + req + '".');
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'app';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _exercise_exercise_list_exercise_list_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./exercise/exercise-list/exercise-list.component */ "./src/app/exercise/exercise-list/exercise-list.component.ts");
/* harmony import */ var _exercise_exercise_create_exercise_create_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./exercise/exercise-create/exercise-create.component */ "./src/app/exercise/exercise-create/exercise-create.component.ts");
/* harmony import */ var _exercise_exercise_edit_exercise_edit_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./exercise/exercise-edit/exercise-edit.component */ "./src/app/exercise/exercise-edit/exercise-edit.component.ts");
/* harmony import */ var _exercise_exercise_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./exercise/exercise.service */ "./src/app/exercise/exercise.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};










var appRoutes = [
    {
        path: 'exercise-list',
        component: _exercise_exercise_list_exercise_list_component__WEBPACK_IMPORTED_MODULE_6__["ExerciseListComponent"],
        data: { title: 'Exercise list' }
    },
    {
        path: 'exercise-create',
        component: _exercise_exercise_create_exercise_create_component__WEBPACK_IMPORTED_MODULE_7__["ExerciseCreateComponent"],
        data: { title: 'Exercise Create' }
    },
    {
        path: 'exercise-edit/:id',
        component: _exercise_exercise_edit_exercise_edit_component__WEBPACK_IMPORTED_MODULE_8__["ExerciseEditComponent"],
        data: { title: 'Exercise Edit' }
    },
    {
        path: '',
        redirectTo: '/exercise-list',
        pathMatch: 'full'
    }
];
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"],
                _exercise_exercise_list_exercise_list_component__WEBPACK_IMPORTED_MODULE_6__["ExerciseListComponent"],
                _exercise_exercise_create_exercise_create_component__WEBPACK_IMPORTED_MODULE_7__["ExerciseCreateComponent"],
                _exercise_exercise_edit_exercise_edit_component__WEBPACK_IMPORTED_MODULE_8__["ExerciseEditComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClientModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(appRoutes)
            ],
            providers: [_exercise_exercise_service__WEBPACK_IMPORTED_MODULE_9__["ExerciseService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/exercise/exercise-create/exercise-create.component.css":
/*!************************************************************************!*\
  !*** ./src/app/exercise/exercise-create/exercise-create.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/exercise/exercise-create/exercise-create.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/exercise/exercise-create/exercise-create.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <h1>New Exercise</h1>\n  <div class=\"row\">\n    <div class=\"col-md-6\">\n      <form (ngSubmit)=\"onSubmit()\" #exerciseForm=\"ngForm\">\n        <div class=\"form-group\">\n          <label for=\"name\">Name</label>\n          <input\n            type=\"text\"\n            class=\"form-control\"\n            [(ngModel)]=\"exercise.name\"\n            name=\"name\"\n            required>\n          <label for=\"instruction\">Instruction</label>\n          <input\n            type=\"text\"\n            class=\"form-control\"\n            [(ngModel)]=\"exercise.instruction\"\n            name=\"instruction\">\n        </div>\n        <div class=\"form-group\">\n          <button\n            type=\"submit\"\n            class=\"btn btn-success\"\n            [disabled]=\"!exerciseForm.valid\"\n            style=\"margin-right: 15px;\">\n            Save\n          </button>\n          <button\n            type=\"button\"\n            class=\"btn btn-danger\"\n            (click)=\"onCancel()\">\n            Cancel\n          </button>\n        </div>\n      </form>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/exercise/exercise-create/exercise-create.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/exercise/exercise-create/exercise-create.component.ts ***!
  \***********************************************************************/
/*! exports provided: ExerciseCreateComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ExerciseCreateComponent", function() { return ExerciseCreateComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _exercise_model__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../exercise.model */ "./src/app/exercise/exercise.model.ts");
/* harmony import */ var _exercise_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../exercise.service */ "./src/app/exercise/exercise.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ExerciseCreateComponent = /** @class */ (function () {
    function ExerciseCreateComponent(service, http, router) {
        this.service = service;
        this.http = http;
        this.router = router;
        this.exercise = new _exercise_model__WEBPACK_IMPORTED_MODULE_3__["Exercise"]();
    }
    ExerciseCreateComponent.prototype.ngOnInit = function () { };
    ExerciseCreateComponent.prototype.onSubmit = function () {
        var _this = this;
        this.service.saveExercise(this.exercise).subscribe(function (res) {
            var id = res['id'];
            _this.router.navigate(['/exercise-list']);
            // this.router.navigate(['/exercise-detail', id]);
        }, function (err) {
            console.log(err);
        });
    };
    ExerciseCreateComponent.prototype.onCancel = function () {
        this.router.navigate(['/exercise-list']);
    };
    ExerciseCreateComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-exercise-create',
            template: __webpack_require__(/*! ./exercise-create.component.html */ "./src/app/exercise/exercise-create/exercise-create.component.html"),
            styles: [__webpack_require__(/*! ./exercise-create.component.css */ "./src/app/exercise/exercise-create/exercise-create.component.css")]
        }),
        __metadata("design:paramtypes", [_exercise_service__WEBPACK_IMPORTED_MODULE_4__["ExerciseService"],
            _angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"],
            _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], ExerciseCreateComponent);
    return ExerciseCreateComponent;
}());



/***/ }),

/***/ "./src/app/exercise/exercise-edit/exercise-edit.component.css":
/*!********************************************************************!*\
  !*** ./src/app/exercise/exercise-edit/exercise-edit.component.css ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/exercise/exercise-edit/exercise-edit.component.html":
/*!*********************************************************************!*\
  !*** ./src/app/exercise/exercise-edit/exercise-edit.component.html ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <h1>Edit Exercise</h1>\n  <div class=\"row\">\n    <div class=\"col-md-6\">\n      <form (ngSubmit)=\"onSubmit()\" #exerciseForm=\"ngForm\">\n        <div class=\"form-group\">\n          <label for=\"name\">Name</label>\n          <input\n            type=\"text\"\n            class=\"form-control\"\n            [(ngModel)]=\"exercise.name\"\n            name=\"name\"\n            required>\n          <label for=\"instruction\">Instruction</label>\n          <input\n            type=\"text\"\n            class=\"form-control\"\n            [(ngModel)]=\"exercise.instruction\"\n            name=\"instruction\">\n        </div>\n        <h2>Rounds</h2>\n        <div *ngFor=\"let round of exercise.rounds\" class=\"form-group\">\n          <h3>Round {{ round.index + 1}}</h3>\n          <label for=\"repeat_{{ round.index }}\">Repeats</label>\n          <input\n            type=\"text\"\n            class=\"form-control\"\n            [(ngModel)]=\"round.repeat\"\n            name=\"repeat_{{ round.index }}\">\n            <label for=\"timeout_{{ round.index }}\">Timeout</label>\n            <input\n              type=\"text\"\n              class=\"form-control\"\n              [(ngModel)]=\"round.timeout\"\n              name=\"timeout_{{ round.index }}\">\n        </div>\n        <button\n          type=\"button\"\n          class=\"btn btn-success\"\n          (click)=\"addRound()\">\n          Add Round\n        </button>\n        <div style=\"height: 5px;\"></div>\n        <hr>\n        <div class=\"form-group\">\n          <button\n            type=\"submit\"\n            class=\"btn btn-success\"\n            [disabled]=\"!exerciseForm.valid\"\n            style=\"margin-right: 15px;\">\n            Save\n          </button>\n          <button\n            type=\"button\"\n            class=\"btn btn-danger\"\n            (click)=\"onCancel()\">\n            Cancel\n          </button>\n        </div>\n      </form>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/exercise/exercise-edit/exercise-edit.component.ts":
/*!*******************************************************************!*\
  !*** ./src/app/exercise/exercise-edit/exercise-edit.component.ts ***!
  \*******************************************************************/
/*! exports provided: ExerciseEditComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ExerciseEditComponent", function() { return ExerciseEditComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _exercise_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../exercise.model */ "./src/app/exercise/exercise.model.ts");
/* harmony import */ var _round_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../round.model */ "./src/app/exercise/round.model.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _exercise_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../exercise.service */ "./src/app/exercise/exercise.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var ExerciseEditComponent = /** @class */ (function () {
    function ExerciseEditComponent(service, router, route) {
        this.service = service;
        this.router = router;
        this.route = route;
        this.exercise = new _exercise_model__WEBPACK_IMPORTED_MODULE_1__["Exercise"]();
    }
    ExerciseEditComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.service.getExercise(this.route.snapshot.params['id']).subscribe(function (data) {
            _this.exercise = data;
        });
        // this.getExercise(this.route.snapshot.params['id']);
    };
    // getExercise (id: number) {
    // this.http.get('/back/exercises/' + id).subscribe(
    //   data => {
    //     this.exercise = <Exercise>data;
    //   }
    // );
    // }
    ExerciseEditComponent.prototype.addRound = function () {
        var round = new _round_model__WEBPACK_IMPORTED_MODULE_2__["Round"]();
        round.exercise = this.exercise.id;
        round.index = this.exercise.rounds.length;
        round.repeat = round.index * 5;
        round.timeout = round.index * 10;
        this.exercise.rounds.push(round);
    };
    ExerciseEditComponent.prototype.onSubmit = function () {
        var _this = this;
        this.service.updateExercise(this.exercise).subscribe(function (res) {
            _this.router.navigate(['/exercise-list']);
        }, function (err) {
            console.log(err);
        });
        // this.http.put('/back/exercise/')
    };
    ExerciseEditComponent.prototype.onCancel = function () {
        this.router.navigate(['exercise-list']);
    };
    ExerciseEditComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-exercise-edit',
            template: __webpack_require__(/*! ./exercise-edit.component.html */ "./src/app/exercise/exercise-edit/exercise-edit.component.html"),
            styles: [__webpack_require__(/*! ./exercise-edit.component.css */ "./src/app/exercise/exercise-edit/exercise-edit.component.css")]
        }),
        __metadata("design:paramtypes", [_exercise_service__WEBPACK_IMPORTED_MODULE_4__["ExerciseService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _angular_router__WEBPACK_IMPORTED_MODULE_3__["ActivatedRoute"]])
    ], ExerciseEditComponent);
    return ExerciseEditComponent;
}());



/***/ }),

/***/ "./src/app/exercise/exercise-list/exercise-list.component.css":
/*!********************************************************************!*\
  !*** ./src/app/exercise/exercise-list/exercise-list.component.css ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/exercise/exercise-list/exercise-list.component.html":
/*!*********************************************************************!*\
  !*** ./src/app/exercise/exercise-list/exercise-list.component.html ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <h1>Exercise List!</h1>\n  <table class=\"table\">\n    <thead>\n      <tr>\n        <th>ID</th>\n        <th>Name</th>\n        <th>Instruction</th>\n      </tr>\n    </thead>\n    <tbody>\n      <tr *ngFor = \"let exercise of exercises\">\n        <td>{{ exercise.id }}</td>\n        <td>{{ exercise.name }}</td>\n        <td>{{ exercise.instruction }}</td>\n        <td>\n          <a\n            [routerLink]=\"['/exercise-edit', exercise.id]\"\n            class=\"btn btn-primary\">\n            edit\n          </a>\n        </td>\n      </tr>\n    </tbody>\n  </table>\n  <a\n    [routerLink]=\"['/exercise-create']\"\n    class=\"btn btn-primary\">\n    Add new exercise\n  </a>\n</div>\n"

/***/ }),

/***/ "./src/app/exercise/exercise-list/exercise-list.component.ts":
/*!*******************************************************************!*\
  !*** ./src/app/exercise/exercise-list/exercise-list.component.ts ***!
  \*******************************************************************/
/*! exports provided: ExerciseListComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ExerciseListComponent", function() { return ExerciseListComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ExerciseListComponent = /** @class */ (function () {
    function ExerciseListComponent(http) {
        this.http = http;
    }
    ExerciseListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.http.get('/back/exercises').subscribe(function (data) {
            _this.exercises = data;
        });
    };
    ExerciseListComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-exercise-list',
            template: __webpack_require__(/*! ./exercise-list.component.html */ "./src/app/exercise/exercise-list/exercise-list.component.html"),
            styles: [__webpack_require__(/*! ./exercise-list.component.css */ "./src/app/exercise/exercise-list/exercise-list.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ExerciseListComponent);
    return ExerciseListComponent;
}());



/***/ }),

/***/ "./src/app/exercise/exercise.model.ts":
/*!********************************************!*\
  !*** ./src/app/exercise/exercise.model.ts ***!
  \********************************************/
/*! exports provided: Exercise */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Exercise", function() { return Exercise; });
var Exercise = /** @class */ (function () {
    function Exercise() {
    }
    return Exercise;
}());



/***/ }),

/***/ "./src/app/exercise/exercise.service.ts":
/*!**********************************************!*\
  !*** ./src/app/exercise/exercise.service.ts ***!
  \**********************************************/
/*! exports provided: ExerciseService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ExerciseService", function() { return ExerciseService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ExerciseService = /** @class */ (function () {
    function ExerciseService(http) {
        this.http = http;
    }
    ExerciseService.prototype.getExercise = function (id) {
        return this.http.get('/back/exercises/' + id);
        // let exercise: Exercise;
        // this.http.get('/back/exercises/' + id).subscribe(
        //   data => {
        //     console.log(data);
        //     exercise = <Exercise>data;
        //   }
        // );
        // return exercise;
    };
    ExerciseService.prototype.saveExercise = function (exercise) {
        return this.http.post('/back/exercises', exercise);
        // .subscribe (
        //   res => {
        //     return res['id'];
        //     // this.router.navigate(['/exercise-list']);
        //     // this.router.navigate(['/exercise-detail', id]);
        //   }, (err) => {
        //     console.log(err);
        //   }
        // );
    };
    ExerciseService.prototype.updateExercise = function (exercise) {
        var _this = this;
        var result = this.http.put('/back/exercises/' + exercise.id, exercise);
        exercise.rounds.forEach(function (round) {
            _this.saveRound(round);
        });
        return result;
    };
    ExerciseService.prototype.saveRound = function (round) {
        if (round.id == null) {
            this.http.post('/back/rounds', round).subscribe(function (res) { }, function (err) {
                console.log(err);
            });
        }
    };
    ExerciseService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])(),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ExerciseService);
    return ExerciseService;
}());



/***/ }),

/***/ "./src/app/exercise/round.model.ts":
/*!*****************************************!*\
  !*** ./src/app/exercise/round.model.ts ***!
  \*****************************************/
/*! exports provided: Round */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Round", function() { return Round; });
var Round = /** @class */ (function () {
    function Round() {
    }
    return Round;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\_Projects\_AngularProjects\Workitout\frontend\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map