import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'period',
                loadChildren: './period/period.module#ExamenjhipsterPeriodModule'
            },
            {
                path: 'project',
                loadChildren: './project/project.module#ExamenjhipsterProjectModule'
            },
            {
                path: 'team',
                loadChildren: './team/team.module#ExamenjhipsterTeamModule'
            },
            {
                path: 'sprint',
                loadChildren: './sprint/sprint.module#ExamenjhipsterSprintModule'
            },
            {
                path: 'story',
                loadChildren: './story/story.module#ExamenjhipsterStoryModule'
            },
            {
                path: 'student',
                loadChildren: './student/student.module#ExamenjhipsterStudentModule'
            },
            {
                path: 'review',
                loadChildren: './review/review.module#ExamenjhipsterReviewModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ExamenjhipsterEntityModule {}
