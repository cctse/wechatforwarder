.class Lcom/yalantis/ucrop/t;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/yalantis/ucrop/UCropActivity;


# direct methods
.method constructor <init>(Lcom/yalantis/ucrop/UCropActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/t;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/t;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/yalantis/ucrop/UCropActivity;->b(Lcom/yalantis/ucrop/UCropActivity;I)V

    :cond_0
    return-void
.end method