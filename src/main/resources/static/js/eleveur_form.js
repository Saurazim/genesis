$(document).ready(function(){
    $('.form').validate({
        rules: {
            nom: 'required',
            prenom: 'required',
            email: {
                required: true,
                email: true
            },
            telFixe: {
                required: true,
                pattern: "^(\\+[0-9]{1,3} |0)[1-9]([\\. ]{0,1}[0-9]{2}){4}$"
            },
            telPort: {
                required: true,
                pattern: "^(\\+[0-9]{1,3} |0)[1-9]([\\. ]{0,1}[0-9]{2}){4}$"
            },
            fax: {
                required: true,
                pattern: "^(\\+[0-9]{1,3} |0)[1-9]([\\. ]{0,1}[0-9]{2}){4}$"
            }
        },
        messages: {
            nom: 'This field is required',
            prenom: 'This field is required',
            email: 'Enter a valid email',
            telFixe: 'This field is required',
            telPort: 'This field is required',
            fax: 'This field is required'
        }
    });
});