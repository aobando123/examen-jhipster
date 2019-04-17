import { NgModule } from '@angular/core';

import { ExamenjhipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [ExamenjhipsterSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [ExamenjhipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class ExamenjhipsterSharedCommonModule {}
